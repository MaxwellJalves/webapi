package com.maxwell.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.maxwell.cursomc.domain.Categoria;
import com.maxwell.cursomc.domain.Produto;
import com.maxwell.cursomc.repositories.CategoriaRepository;
import com.maxwell.cursomc.repositories.ProdutoRepository;


@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	@Autowired
	CategoriaRepository categoria;
	@Autowired
	ProdutoRepository produto;
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Celulares");
		Categoria cat3 = new Categoria(null,"Ofertas do Dia");
		
		
		Produto  prd1 = new Produto(null,"NOTEBOOK POSITIVO",120.2);
		Produto  prd2 = new Produto(null,"CELULAR MOTOROLA G100",120.2);
		Produto  prd3 = new Produto(null,"LISO BOOK",120.2);
		Produto  prd4 = new Produto(null,"SSD ALIEXPRESS",120.2);
		Produto  prd5 = new Produto(null,"COMBO GAME",120.2);
		
		cat1.getProdutos().addAll(Arrays.asList(prd1,prd3,prd4));
		cat2.getProdutos().addAll(Arrays.asList(prd2));
		cat3.getProdutos().addAll(Arrays.asList(prd3,prd5));
		
		prd1.getCategorias().addAll(Arrays.asList(cat1));
		prd2.getCategorias().addAll(Arrays.asList(cat2));
		prd3.getCategorias().addAll(Arrays.asList(cat1,cat3));
		prd4.getCategorias().addAll(Arrays.asList(cat1));
		prd5.getCategorias().addAll(Arrays.asList(cat1,cat3));
		
		categoria.saveAll(Arrays.asList(cat1,cat2,cat3));
		produto.saveAll(Arrays.asList(prd1,prd2,prd3,prd4,prd5));
		
	}

}

/* ## Carga inicial
	DROP TABLE PRODUTO_CATEGORIA;
	DROP TABLE PRODUTO;
	DROP TABLE CATEGORIA;
	
	INSERT INTO PRODUTO VALUES (NULL,'NOTEBOOK POSITIVO',2220.2);
	INSERT INTO PRODUTO VALUES (NULL,'CELULAR MOTOROLA G100 ',990.2);
	INSERT INTO PRODUTO VALUES (NULL,'LISO BOOK',300.00);
	INSERT INTO PRODUTO VALUES (NULL,'SSD ALIEXPRESS',20.0);
	INSERT INTO PRODUTO VALUES (NULL,'COMBO GAME',12000.20);
	
	INSERT INTO CATEGORIA  VALUES (NULL,'INFORMÁTICA');
	INSERT INTO CATEGORIA  VALUES (NULL,'CELULARES');
	INSERT INTO CATEGORIA  VALUES (NULL,'TV E VIDEO');
	INSERT INTO CATEGORIA  VALUES (NULL,'MÓVEIS');
	INSERT INTO CATEGORIA  VALUES (NULL,'OFERTAS DO DIA');
	INSERT INTO CATEGORIA  VALUES (NULL,'ELETRODOMÉSTICOS');

 * */
 