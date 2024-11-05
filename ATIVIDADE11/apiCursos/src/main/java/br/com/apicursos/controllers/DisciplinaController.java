package com.senaidev.cursoproduto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cursoproduto.entities.Disciplina;
import com.senaidev.cursoproduto.services.DisciplinaService;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

	@Autowired
	private DisciplinaService disciplinaService;
	
	@PostMapping
	public Disciplina createDisciplina(Disciplina disciplina) {
		
		return disciplinaService.saveDisciplina(disciplina);
	}
	
	@GetMapping
	public List<Disciplina>getAllDisciplina() {
		
		return disciplinaService.getAllDisciplinas();
	}
	
	@GetMapping("/{id}")
	public Disciplina getDisciplina(@PathVariable Long id) {
		return disciplinaService.getDisciplinaById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteDisciplina(@PathVariable Long id) {
		disciplinaService.deleteDisciplina(id);
	}
}
