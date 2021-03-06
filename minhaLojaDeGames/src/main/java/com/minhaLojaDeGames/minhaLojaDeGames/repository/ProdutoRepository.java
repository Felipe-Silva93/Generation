package com.minhaLojaDeGames.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaLojaDeGames.minhaLojaDeGames.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto,Long>{
	
	public List<Produto> findAllByDescricaoProdutoContainingIgnoreCase(String descricaoProduto);
}
