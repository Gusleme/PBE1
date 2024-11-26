package com.senaidev.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.livraria.entities.Editora;

public interface EditoraRepository extends JpaRepository <Editora, Long> {
	Editora findByCnpj(String cnpj);
}
