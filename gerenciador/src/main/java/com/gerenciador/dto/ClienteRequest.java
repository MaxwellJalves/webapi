package com.gerenciador.dto;

import com.gerenciador.enums.TipoAtendimento;
import com.gerenciador.model.Cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteRequest {
	
	private String nome;
	private TipoAtendimento tipo;
	public static Cliente toEntity(ClienteRequest cliente) {
		Cliente cli = new Cliente(null,cliente.getNome(),cliente.getTipo());
		return cli;
	}
	
	 

}
