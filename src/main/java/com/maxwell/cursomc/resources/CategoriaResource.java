package com.maxwell.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public String findAll() {
		//código teste
		List<String>  test = new ArrayList<String>();
		test.add("INFORMATICA");
		test.add("LIVROS");
		test.add("ELETRONICOS");	
		return "Return : "  + test.toString();
	}
}
