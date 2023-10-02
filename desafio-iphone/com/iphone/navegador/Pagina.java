package com.iphone.navegador;

public class Pagina {

	private String url;
	private String nomePagina;
	
	public Pagina(String nome, String url) {
		this.nomePagina = nome;
		this.url = url;
	}
	
	public String getNomePagina() {
		return nomePagina;
	}
	
	public String getUrl() {
		return url;
	}
	
	@Override
	public String toString() {
		return "Página: " + getNomePagina() +
				", URL: " + getUrl();
	}
}
