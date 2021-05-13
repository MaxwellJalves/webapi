package com.maxwell.cursomc.resources.exception;

import java.io.Serializable;

public class Error implements Serializable {


	private static final long serialVersionUID = 1L;

	private Integer status;
	private String menssagem;
	private long  timestamp;
	
	public Error(Integer status, String menssagem, long instante) {
		super();
		this.status = status;
		this.menssagem = menssagem;
		this.timestamp = instante;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMenssagem() {
		return menssagem;
	}
	public void setMenssagem(String menssagem) {
		this.menssagem = menssagem;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long instante) {
		this.timestamp = instante;
	}
	
	
	
	
	
}
