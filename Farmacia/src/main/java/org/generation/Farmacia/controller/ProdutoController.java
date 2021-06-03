package org.generation.Farmacia.controller;

import java.util.List;

import org.generation.Farmacia.model.Produto;
import org.generation.Farmacia.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Produto")
public class ProdutoController {




		@Autowired
		private ProdutoRepository repository;
		
		@GetMapping("/todos")
		
		public ResponseEntity<List<Produto>> getAll(){
			List<Produto> listaDeNomeProduto = repository.findAll();
			if(listaDeNomeProduto.isEmpty()) {
				return ResponseEntity.status(204).build();
				
				}else {
					return ResponseEntity.status(200).body(listaDeNomeProduto);
				}
		}

		@GetMapping("{idProduto}")
		
		public ResponseEntity<Produto>GetById(@PathVariable long idProduto){
			return repository.findById(idProduto)
					.map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
		}
		@GetMapping("/descricaoProduto")
		 public ResponseEntity<Object> buscarDescricaoProduto(@RequestParam(defaultValue = "") String descricaoProduto) {
			List<Produto> listaDeProduto = repository.findAllByDescricaoProdutoContainingIgnoreCase(descricaoProduto);
			
			
			if (listaDeProduto.isEmpty()) {
				
				return ResponseEntity.status(204).build();
			} else {
				
				return ResponseEntity.status(204).body(listaDeProduto);
		
			}
		}
				@PostMapping
				public ResponseEntity <Produto> post (@RequestBody Produto nomeProduto){
					return ResponseEntity.status(201).body(repository.save(nomeProduto));
				}
				@PutMapping
				public ResponseEntity <Produto> put (@RequestBody Produto nomeProduto){
					return ResponseEntity.status(200).body(repository.save(nomeProduto));
				}
				@DeleteMapping ("/{idProduto}")
				public void delete(@PathVariable long idProduto) {
					repository.deleteById(idProduto);
				}
		
		
		
				
	}

	

