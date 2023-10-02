package com.iphone.exceptions.musica;

public class MusicaNaoSelecionadaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MusicaNaoSelecionadaException() {
		super("Não há música selecionada!");
	}
}
