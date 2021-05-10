package com.maxwell.cursomc.resources;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maxwell.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> findAll() {
		
		Categoria cat1 = new Categoria();
		cat1.setId(1000);
		cat1.setNome("ELETRODOMESTICOS");

		Categoria cat2 = new Categoria();
		cat2.setId(1002);
		cat2.setNome("INFORMATICA");

		List<Categoria> categoria = new ArrayList<>();
		categoria.add(cat1);
		categoria.add(cat2);
		return categoria;
	}
}
