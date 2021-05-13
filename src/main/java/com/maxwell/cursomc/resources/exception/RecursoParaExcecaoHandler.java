package com.maxwell.cursomc.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.maxwell.cursomc.services.exception.RetorneUmaExcessao;

@ControllerAdvice
public class RecursoParaExcecaoHandler {

	public RecursoParaExcecaoHandler() {
	}

	@ExceptionHandler(RetorneUmaExcessao.class)
	public ResponseEntity<Error> retorneErro(RetorneUmaExcessao e, HttpServletRequest req) {
		Error erro = new Error(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

}
