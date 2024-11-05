package com.senaidev.cursoproduto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cursoproduto.entities.Instrutores;

@Service
public class InstrutoresServices {

	@Autowired
	private InstrutoresServices instrutoresrepository;
	
	public Instrutores saveInstrutores(Instrutores instrutores) {
		
		return instrutoresrepository.save(instrutores);
	}
	
	public List<Instrutores> getAllInstrutores() {
		
		return instrutoresrepository.findAll();
	}
	
	public Instrutores getInstrutoresById (Long id) {
		
		return instrutoresrepository.findById(id).orElse(null);
	}
	
	public void deleteInstrutores(Long id) {
		instrutoresrepository.deleteById(id);
	}
}
