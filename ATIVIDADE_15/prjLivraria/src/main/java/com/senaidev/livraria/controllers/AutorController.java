package com.senaidev.livraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.senaidev.livraria.entities.Autor;
import com.senaidev.livraria.services.AutorService;

public class AutorController {

	@Autowired
	private AutorService autorService;

	@GetMapping
	public List<Autor> buscarAutor() {
		return autorService.buscarAutor();
	}
	@GetMapping("/id")
	public ResponseEntity<Object> buscarAutorPorId(@PathVariable long id) {
		Autor autor = autorService.buscarAutorPorId(id);
		
		if(autor != null) {
			return ResponseEntity.ok(autor);
		} else {
			return ResponseEntity.status(404).body("Autor com ID " + id + "não foi encontrado");
		}
	}

	@PostMapping
	public Autor criarAutor(@RequestBody Autor autor) {
		return autorService.criarAutor(autor);
	}

	@DeleteMapping("/{id}")
	public void excluirAutor(@PathVariable Long id) {
		autorService.excluirAutor(id);
	}
}
