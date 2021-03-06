package com.minhaLojaDeGames.minhaLojaDeGames.cotroller;

import java.util.List;

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

import com.minhaLojaDeGames.minhaLojaDeGames.model.Categoria;
import com.minhaLojaDeGames.minhaLojaDeGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")

public class CategoriaController {
	@Autowired
	private CategoriaRepository repositoryC;
	
	@GetMapping("/todos")
	
	public ResponseEntity<List<Categoria>> getAll(){
		List<Categoria> listaDeNomeCategoria = repositoryC.findAll();
		if(listaDeNomeCategoria.isEmpty()) {
			return ResponseEntity.status(204).build();
			
			}else {
				return ResponseEntity.status(200).body(listaDeNomeCategoria);
			}
	}
	
	@GetMapping("{idCategoria}")
	
	public ResponseEntity<Categoria>GetById(@PathVariable long idCategoria){
		return repositoryC.findById(idCategoria)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricaoDeCategoria")
	 public ResponseEntity<Object> buscarDescricaoCategoria(@RequestParam(defaultValue = "") String descricaoCategoria) {
		List<Categoria> listaDeCategoria = repositoryC.findAllByDescricaoCategoriaContainingIgnoreCase(descricaoCategoria);
		
		
		if (listaDeCategoria.isEmpty()) {
			
			return ResponseEntity.status(204).build();
		} else {
			
			return ResponseEntity.status(204).body(listaDeCategoria);
	
		}
	}
	@PostMapping
	public ResponseEntity <Categoria> post (@RequestBody Categoria nomeCategoria){
		return ResponseEntity.status(201).body(repositoryC.save(nomeCategoria));
	}
	@PutMapping
	public ResponseEntity <Categoria> put (@RequestBody Categoria nomeCategoria){
		return ResponseEntity.status(200).body(repositoryC.save(nomeCategoria));
	}
	@DeleteMapping ("/{idCategoria}")
	public void delete(@PathVariable long idCategoria) {
		repositoryC.deleteById(idCategoria);
	}
}

	

