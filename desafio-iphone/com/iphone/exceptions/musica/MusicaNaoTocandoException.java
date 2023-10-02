package com.iphone.exceptions.musica;

public class MusicaNaoTocandoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MusicaNaoTocandoException() {
		super("Não há música tocando!");
	}
}
