package com.maxwell.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maxwell.cursomc.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProtudoResource {
	
	@Autowired
	ProdutoService prdService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok().body(prdService.findAll());
	}

}
