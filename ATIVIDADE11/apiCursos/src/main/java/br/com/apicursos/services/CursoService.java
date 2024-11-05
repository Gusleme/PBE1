package com.senaidev.cursoproduto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cursoproduto.entities.Aluno;
import com.senaidev.cursoproduto.entities.Curso;

@Service
public class CursoService {

	@Autowired
	private CursoService cursorepository;
	
	public Curso saveCurso(Curso curso) {
		
		return cursorepository.save(curso);
	}
	
	public List<Curso> getAllCursos() {
		
		return cursorepository.findAll();
	}
	
	public Aluno getCursoById (Long id) {
		
		return cursorepository.findById(id).orElse(null);
	}
	
	public void deleteCurso(Long id) {
		cursorepository.deleteById(id);
	}
}
