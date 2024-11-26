package com.senaidev.livraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.senaidev.livraria.entities.Livro;
import com.senaidev.livraria.services.LivroService;

public class LivroController {

	@Autowired
	private LivroService livroService;

	@GetMapping
	public List<Livro> buscarLivro() {
		return livroService.buscarLivro();
	}
	@GetMapping("/id")
	public ResponseEntity<Object> buscarLivrosPorId(@PathVariable long id) {
		Livro livro = livroService.buscarLivroPorId(id);
		
		if(livro != null) {
			return ResponseEntity.ok(livro);
		} else {
			return ResponseEntity.status(404).body("Livro com ID " + id + "não foi encontrado");
		}
	}
	@GetMapping("/isbn/{isbn}")
	public ResponseEntity<Object> buscarLivroPorIsbn(@PathVariable String isbn) {
		Livro livro = livroService.buscarLivroPorIsbn(isbn);
		
		if(livro != null) {
			return ResponseEntity.ok(livro);
		} else {
			return ResponseEntity.status(404).body("Livro com ISBN "+ isbn + "não foi encontrado");
		}
	}

	@PostMapping
	public Livro criarLivro(@RequestBody Livro livro) {
		return livroService.criarLivro(livro);
	}

	@DeleteMapping("/{id}")
	public void excluirLivro(@PathVariable Long id) {
		livroService.excluirLivro(id);
	}
}
