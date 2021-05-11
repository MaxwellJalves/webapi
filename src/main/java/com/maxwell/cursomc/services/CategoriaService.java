package com.maxwell.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxwell.cursomc.domain.Categoria;
import com.maxwell.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoria;

	public Categoria find(Integer id) {
		Optional<com.maxwell.cursomc.domain.Categoria> cat = categoria.findById(id);
		return (Categoria) cat.orElse(null);
	}


}