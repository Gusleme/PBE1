package com.senaidev.cursoproduto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cursoproduto.entities.Aluno;
import com.senaidev.cursoproduto.services.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@PostMapping
	public Aluno createEditora(Aluno aluno) {
		
		return alunoService.saveAluno(aluno);
	}
	
	@GetMapping
	public List<Aluno>getAllAluno() {
		
		return alunoService.getAllAlunos();
	}
	
	@GetMapping("/{id}")
	public Aluno getAluno(@PathVariable Long id) {
		return	alunoService.getAlunoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAluno(@PathVariable Long id) {
		alunoService.deleteAluno(id);
	}
}
