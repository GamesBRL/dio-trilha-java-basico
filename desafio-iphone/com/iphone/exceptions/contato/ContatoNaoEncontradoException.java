package com.iphone.exceptions.contato;

public class ContatoNaoEncontradoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContatoNaoEncontradoException() {
		super("Contato não encontrado!");
	}
}
