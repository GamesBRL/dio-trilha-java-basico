package com.iphone.ligacao;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.iphone.exceptions.contato.*;

public class AgendaContatos {

	private Set<Contato> listaContatos;
	private boolean recebendoLigacao = false;
	
	public AgendaContatos() {
		this.listaContatos = new HashSet<>();
	}
	
	public void adicionarContato(String nome, long numero) throws ContatoDuplicadoException {
		if(contatoDuplicado(nome)) {
			throw new ContatoDuplicadoException();
		}
		listaContatos.add(new Contato(nome,numero));
	}
	
	private boolean contatoDuplicado(String nome){
		return listaContatos.stream()
			.anyMatch(contato ->
				contato.getNome().equalsIgnoreCase(nome));
	}
	
	public void ligarPara(String nome) throws ContatoNaoEncontradoException {
		Predicate<Contato> porNome = contato -> contato.getNome().equalsIgnoreCase(nome);
		Optional<Contato> contatoLigar = listaContatos.stream()
			.filter(porNome)
			.findFirst();
		if(contatoLigar.isPresent()) {
			System.out.println(String.format("Ligando para '%s': '%i'",contatoLigar.get().getNome(),contatoLigar.get().getNumero()));
		}
		else {
			throw new ContatoNaoEncontradoException();
		}
	}
	
	public void ligarParaSiMesmoEXEMPLO() {
		System.out.println("RECEBENDO LIGAÇÃO");
		recebendoLigacao = true;
	}
	
	public void atenderEXEMPLO() throws NaoHaLigacaoException {
		if(!recebendoLigacao) {
			throw new NaoHaLigacaoException();
		}else {
			System.out.println("ATENDENDO!");
		}
	}
	
	public void iniciarCorreioDeVozEXEMPLO() {
		System.out.println("Iniciando correio de voz");
	}
	
	public void exibirContatos() {
		listaContatos.stream()
			.forEach(System.out::println);
	}
	
	public void pesquisarPorNome(String nome) throws ContatoNaoEncontradoException{
		Predicate<Contato> porNome = contato -> contato.getNome().toLowerCase().startsWith(nome.toLowerCase());
		Set<Contato> contatosEncontrados = listaContatos.stream()
			.filter(porNome)
			.collect(Collectors.toSet());
		if(contatosEncontrados.isEmpty()) {
			throw new ContatoNaoEncontradoException();
		}
		contatosEncontrados.stream().forEach(System.out::println);
	}
	
	public void removerContato(String nome) throws ContatoNaoEncontradoException {
        Predicate<Contato> porNome = contato -> contato.getNome().equalsIgnoreCase(nome);
        boolean removido = listaContatos.removeIf(porNome);
        if (!removido) {
            throw new ContatoNaoEncontradoException();
        }
    }
	
	public void atualizarContato(String nome, long novoNumero) throws ContatoNaoEncontradoException {
        Predicate<Contato> porNome = contato -> contato.getNome().equalsIgnoreCase(nome);
        listaContatos.stream()
        	.filter(porNome)
        	.findFirst()
        	.ifPresent(contato -> contato.setNumero(novoNumero));
	}
	
}
