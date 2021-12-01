package org.generation.blog.controller;

import java.util.List;

import org.generation.blog.model.Postagem;
import org.generation.blog.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/postagens")
@CrossOrigin("*")
public class PostagemController {
		
	
		//declara um repository e depois o nome dele que pode ser qualquer coisa
		@Autowired
		private PostagemRepository postagemRepository;
		
	
		@GetMapping
		public ResponseEntity<List<Postagem>> findAll(){
			return ResponseEntity.ok(postagemRepository.findAll());
			
		}
		
		// Retorna uma postagem pelo título
	    @GetMapping("/{id}")
	    public ResponseEntity<Postagem> GetById(@PathVariable long id){
	        return postagemRepository.findById(id)
	        .map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	    }

	    // Retorna postagem pelo título
	    @GetMapping("/titulo/{titulo}")
	    public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
	    	return ResponseEntity.ok(postagemRepository.findAllByTituloContainingIgnoreCase(titulo));
	    }
		
}
