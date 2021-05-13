package com.maxwell.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxwell.cursomc.domain.Produto;
import com.maxwell.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository produto;
	
	public List<Produto> findAll(){
		return produto.findAll();
	}

	
}
