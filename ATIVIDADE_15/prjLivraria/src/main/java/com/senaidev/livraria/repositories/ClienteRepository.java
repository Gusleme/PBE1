package com.senaidev.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.livraria.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {
	Cliente findByCpf(String cpf);
}
