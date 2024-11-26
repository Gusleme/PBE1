package com.senaidev.livraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.senaidev.livraria.entities.Editora;
import com.senaidev.livraria.services.EditoraService;

public class EditoraController {

	@Autowired
	private EditoraService editoraService;

	@GetMapping
	public List<Editora> buscarEditora() {
		return editoraService.buscarEditora();
	}
	@GetMapping("/id")
	public ResponseEntity<Object> buscarEditoraPorId(@PathVariable long id) {
		Editora editora = editoraService.buscarEditoraPorId(id);
		
		if(editora != null) {
			return ResponseEntity.ok(editora);
		} else {
			return ResponseEntity.status(404).body("Editora com ID " + id + "não foi encontrado");
		}
	}
	@GetMapping("/cnpj/{cnpj}")
	public ResponseEntity<Object> buscarEditoraPorCnpj(@PathVariable String cnpj) {
		Editora editora = editoraService.buscarEditoraPorCnpj(cnpj);
		
		if(editora != null) {
			return ResponseEntity.ok(editora);
		} else {
			return ResponseEntity.status(404).body("Cliente com CPF "+ cnpj + "não foi encontrado");
		}
	}

	@PostMapping
	public Editora criarEditora(@RequestBody Editora editora) {
		return editoraService.criarEditora(editora);
	}

	@DeleteMapping("/{id}")
	public void excluirEditora(@PathVariable Long id) {
		editoraService.excluirEditora(id);
	}
}
