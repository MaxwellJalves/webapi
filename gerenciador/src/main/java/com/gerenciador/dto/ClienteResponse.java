package com.gerenciador.dto;

import com.gerenciador.enums.TipoAtendimento;
import com.gerenciador.model.Cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ClienteResponse {

    private Long id;
	private TipoAtendimento tipo;
	 
	 
	public static ClienteResponse toDto(Cliente c1) {
	
		ClienteResponse c2 = new ClienteResponse();
		c2.setId(c1.getId());
		c2.setTipo(c1.getTipo());
		return c2;
	}
	

	
	
}
