package com.senaidev.cursoproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cursoproduto.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
