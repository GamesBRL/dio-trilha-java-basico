package com.iphone.musica;

public class Musica {
	
	private String Nome;
	private String Artista;
	private int id;
	
	public Musica(String nome, String artista, int id){
		this.Nome = nome;
		this.Artista = artista;
		this.id = id;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public String getArtista() {
		return Artista;
	}
	
	public int getID() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Música: " + getNome() + ", " +
				"Artista: " + getArtista() + ", " +
				"ID: " + getID();	
	}
}
