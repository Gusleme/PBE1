package com.senaidev.cursoproduto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cursoproduto.entities.Instrutores;
import com.senaidev.cursoproduto.services.InstrutoresServices;

@RestController
@RequestMapping("/instrutores")
public class InstrutoresController {

	@Autowired
	private InstrutoresServices instrutoresService;
	
	@PostMapping
	public Instrutores createInstrutores(Instrutores instrutores) {
		
		return instrutoresService.saveInstrutores(instrutores);
	}
	
	@GetMapping
	public List<Instrutores>getAllInstrutores() {
		
		return instrutoresService.getAllInstrutores();
	}
	
	@GetMapping("/{id}")
	public Instrutores getInstrutores(@PathVariable Long id) {
		return instrutoresService.getInstrutoresById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteInstrutores(@PathVariable Long id) {
		instrutoresService.deleteInstrutores(id);
	}
}
