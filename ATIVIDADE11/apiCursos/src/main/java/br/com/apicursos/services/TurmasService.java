package com.senaidev.cursoproduto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmasService {

	@Autowired
	private TurmasService turmaresrepository;
	
	public Turma saveTurmas(Turma turma) {
		
		return turmaresrepository.save(turma);
	}
	
	public List<Turma> getAllTurmas() {
		
		return turmaresrepository.findAll();
	}
	
	public Turma getTurmaById (Long id) {
		
		return turmaresrepository.findById(id).orElse(null);
	}
	
	public void deleteTurma(Long id) {
		turmaresrepository.deleteById(id);
	}
}
