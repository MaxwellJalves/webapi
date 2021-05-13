package com.maxwell.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxwell.cursomc.domain.Categoria;
import com.maxwell.cursomc.repositories.CategoriaRepository;
import com.maxwell.cursomc.services.exception.RetorneUmaExcessao;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoria;
	

	public Categoria find(Integer id) {
		Optional<Categoria> cat = categoria.findById(id);
		return  cat.orElseThrow(()-> new RetorneUmaExcessao("Ops X(  a Categoria informada :  " + id +" Não existe em nossa base de dados!"));
	}
	
	public List<Categoria> findAll(){
		List<Categoria> lista = categoria.findAll();
 		return lista;
	}


}
