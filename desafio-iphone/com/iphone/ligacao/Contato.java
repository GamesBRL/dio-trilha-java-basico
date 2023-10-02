package com.iphone.ligacao;

public class Contato {
	
	private String Nome;
	private long Numero;
	
	public Contato(String nome, long numero) {
		this.Nome = nome;
		this.Numero = numero;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public long getNumero() {
		return Numero;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public void setNumero(long numero) {
		Numero = numero;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Contato: " + getNome() + ", " +
				"Numero: " + getNumero();
	}
}
