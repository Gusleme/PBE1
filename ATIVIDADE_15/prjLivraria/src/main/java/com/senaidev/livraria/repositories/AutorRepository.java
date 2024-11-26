package com.senaidev.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.livraria.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
