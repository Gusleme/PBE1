package com.senaidev.livraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.senaidev.livraria.entities.Cliente;
import com.senaidev.livraria.services.ClienteService;

public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public List<Cliente> buscarClientes() {
		return clienteService.buscarClientes();
	}
	@GetMapping("/id")
	public ResponseEntity<Object> buscarEnderecoPorId(@PathVariable long id) {
		Cliente cliente = clienteService.buscarClientesPorId(id);
		
		if(cliente != null) {
			return ResponseEntity.ok(cliente);
		} else {
			return ResponseEntity.status(404).body("Cliente com ID " + id + "não foi encontrado");
		}
	}
	@GetMapping("/cpf/{cpf}")
	public ResponseEntity<Object> buscarClientePorCpf(@PathVariable String cpf) {
		Cliente cliente = clienteService.buscarClientePorCpf(cpf);
		
		if(cliente != null) {
			return ResponseEntity.ok(cliente);
		} else {
			return ResponseEntity.status(404).body("Cliente com CPF "+ cpf + "não foi encontrado");
		}
	}

	@PostMapping
	public Cliente criarCliente(@RequestBody Cliente cliente) {
		return clienteService.criarCliente(cliente);
	}

	@DeleteMapping("/{id}")
	public void excluirCliente(@PathVariable Long id) {
		clienteService.excluirCliente(id);
	}
}
