package com.iphone.exceptions.contato;

public class ContatoDuplicadoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContatoDuplicadoException() {
		super("Contato já existente!");
	}
}
