package com.maxwell.cursomc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Default {

	@RequestMapping("/")
	@ResponseBody
	public String getIndex() {
		return "<h2>Conexão Realizada com sucesso! <h2>";
	}
}
