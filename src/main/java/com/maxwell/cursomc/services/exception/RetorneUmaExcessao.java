package com.maxwell.cursomc.services.exception;

public class RetorneUmaExcessao extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public RetorneUmaExcessao(String mensagem) {
		super(mensagem);
	}
	
	public RetorneUmaExcessao(String msg, Throwable causa) {
		super(msg,causa);
	}

}
