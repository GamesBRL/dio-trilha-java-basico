package com.iphone.exceptions.contato;

public class NaoHaLigacaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NaoHaLigacaoException() {
		super("Não está recebendo ligação!");
	}
}
