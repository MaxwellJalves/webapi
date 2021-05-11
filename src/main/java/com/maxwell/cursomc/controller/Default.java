package com.maxwell.cursomc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Default {

	@RequestMapping("/")
	@ResponseBody
	public String getIndex() {
		StringBuilder sb = new StringBuilder();
		sb.append("<ul>")
		.append("</br>").append("<li>").append("https/localhost:8082/categorias/{id}").append("</li>")
		.append("</br>").append("<li>").append("https/localhost:8082/categorias").append("</li>")
		.append("</br>").append("<li>").append("https/localhost:8082/produtos/{id}").append("</li>")
		.append("</br>").append("<li>").append("https/localhost:8082/produtos/{name}").append("</li>")
		.append("</br>").append("</ul>");
		return sb.toString();
	}
}
