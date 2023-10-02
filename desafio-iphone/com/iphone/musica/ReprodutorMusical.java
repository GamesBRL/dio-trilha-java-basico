package com.iphone.musica;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import com.iphone.exceptions.musica.*;

public class ReprodutorMusical {

	private Set<Musica> listaMusicas;
	private int musicaSelecionada;
	private boolean musicaTocando = false;
	
	public ReprodutorMusical() {
		this.listaMusicas = new HashSet<>();
	}
	
	private int gerarID() {
		Random rand = new Random();
		int id = rand.nextInt(10000);
		return id;
	}
	
	public void adicionarMusica(String nome, String artista) throws MusicaDuplicadaException {
		if(musicaDuplicada(nome,artista)) {
			throw new MusicaDuplicadaException();
		}
		listaMusicas.add(new Musica(nome,artista,gerarID()));
	}
	
	private boolean musicaDuplicada(String nome, String artista) {
		return listaMusicas.stream()
			.anyMatch(musica ->
				musica.getNome().equalsIgnoreCase(nome) && musica.getArtista().equalsIgnoreCase(artista));
	}
	
	public void exibirListaMusicas() {
		listaMusicas.stream()
			.forEach(System.out::println);
	}
	
	public void selecionarMusica(String nome, String artista) throws MusicaNaoEncontradaException {
		boolean encontrada = false;
		for(Musica m : listaMusicas) {
			if(m.getNome() == nome && m.getArtista() == artista ) {
				this.musicaSelecionada = m.getID();
				encontrada = true;
				break;
			}
		}
		if(!encontrada) {
			throw new MusicaNaoEncontradaException();
		}
	}
	
	public void removerMusicaSelecionada() throws MusicaNaoSelecionadaException {
		Set<Musica> musicaRemover = listaMusicas.stream()
			.filter(musica -> musica.getID() == this.musicaSelecionada)
			.collect(Collectors.toSet());
		if(musicaRemover.isEmpty()) {
			throw new MusicaNaoSelecionadaException();
		}
		listaMusicas.removeAll(musicaRemover);
	}
	
	public void tocarMusicaSelecionada() throws MusicaNaoSelecionadaException {
		Musica tocarMusica = listaMusicas.stream()
			.filter(musica -> musica.getID() == this.musicaSelecionada)
			.findFirst()
			.orElseThrow(() -> new MusicaNaoSelecionadaException());
		System.out.println("Tocando a música: " + tocarMusica.getNome() + ":" + tocarMusica.getArtista());
		this.musicaTocando = true;
	}
	
	public void pausarMusicaSelecionada() throws MusicaNaoTocandoException{
		if(!musicaTocando) {
			throw new MusicaNaoTocandoException();
		}
		Musica pausarMusica = listaMusicas.stream()
			.filter(musica -> musica.getID() == this.musicaSelecionada)
			.findFirst()
			.orElseThrow();
		System.out.println("Pausando a música: " + pausarMusica.getNome() + ":" + pausarMusica.getArtista());
		this.musicaTocando = false;
	}
	
}
