package com.senaidev.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.livraria.entities.Livro;

public interface LivroRepository extends JpaRepository <Livro, Long> {
	Livro findByIsbn(String isbn);
}
