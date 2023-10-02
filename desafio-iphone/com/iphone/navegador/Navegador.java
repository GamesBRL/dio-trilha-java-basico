package com.iphone.navegador;

import java.util.ArrayList;
import java.util.List;

public class Navegador {

	private List<Pagina> paginasAbertas;
	private int paginaID;
	
	public Navegador() {
		this.paginasAbertas = new ArrayList<>();
	}
	
	public void adicionarNovaAba(String nome, String url) {
		paginasAbertas.add(new Pagina(nome,url));
	}
	
	public void selecionarPagina(int id) {
	    if (id >= 0 && id < paginasAbertas.size()) {
	        this.paginaID = id;
	        System.out.println("Página selecionada: " + paginasAbertas.get(id).getNomePagina());
	    } else {
	        System.out.println("A página com ID " + id + " não existe.");
	    }
	}

	public void exibirPagina() {
	    if (paginaID >= 0 && paginaID < paginasAbertas.size()) {
	        Pagina paginaAtual = paginasAbertas.get(paginaID);
	        System.out.println("Exibindo a página: " + paginaAtual.getNomePagina());
	        System.out.println("URL: " + paginaAtual.getUrl());
	    } else {
	        System.out.println("Nenhuma página selecionada ou a página selecionada não existe.");
	    }
	}
	
	public void atualizarPagina() {
	    if (paginaID >= 0 && paginaID < paginasAbertas.size()) {
	        Pagina paginaAtual = paginasAbertas.get(paginaID);
	        System.out.println("Atualizando a página " + paginaAtual.getNomePagina());
	        System.out.println("URL : " + paginaAtual.getUrl());
	    } else {
	        System.out.println("Nenhuma página selecionada ou a página selecionada não existe.");
	    }
	}

}
