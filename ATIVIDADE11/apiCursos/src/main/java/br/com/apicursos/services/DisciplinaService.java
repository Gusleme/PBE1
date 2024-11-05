package com.senaidev.cursoproduto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cursoproduto.entities.Disciplina;

@Service
public class DisciplinaService {

	@Autowired
	private DisciplinaService disciplinarepository;
	
	public Disciplina saveDisciplina(Disciplina disciplina) {
		
		return disciplinarepository.save(disciplina);
	}
	
	public List<Disciplina> getAllDisciplinas() {
		
		return disciplinarepository.findAll();
	}
	
	public Disciplina getDisciplinaById (Long id) {
		
		return disciplinarepository.findById(id).orElse(null);
	}
	
	public void deleteDisciplina(Long id) {
		disciplinapository.deleteById(id);
	}
}
