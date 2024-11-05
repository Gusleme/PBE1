package com.senaidev.cursoproduto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cursoproduto.entities.Curso;
import com.senaidev.cursoproduto.services.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoService cursoService;
	
	@PostMapping
	public Curso createCurso(Curso curso) {
		
		return cursoService.saveCurso(curso);
	}
	
	@GetMapping
	public List<Curso>getAllCurso() {
		
		return cursoService.getAllCursos();
	}
	
	@GetMapping("/{id}")
	public Curso getCurso(@PathVariable Long id) {
		return cursoService.getCursoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCurso(@PathVariable Long id) {
		cursoService.deleteCurso(id);
	}
}
