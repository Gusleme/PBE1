package com.senaidev.cursoproduto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cursoproduto.entities.Aluno;

@Service
public class AlunoService {

	@Autowired
	private AlunoService alunorepository;
	
	public Aluno saveAluno(Aluno aluno) {
		
		return alunorepository.save(aluno);
	}

	public List<Aluno> getAllAlunos() {
		
		return alunorepository.findAll();
	}
	
	public Aluno getAlunoById (Long id) {
		
		return alunorepository.findById(id).orElse(null);
	}
	
	public void deleteAluno(Long id) {
		alunorepository.deleteById(id);
	}
}
