package com.iphone.exceptions.musica;

public class MusicaNaoEncontradaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MusicaNaoEncontradaException() {
		super("Música não encontrada!");
	}
}
