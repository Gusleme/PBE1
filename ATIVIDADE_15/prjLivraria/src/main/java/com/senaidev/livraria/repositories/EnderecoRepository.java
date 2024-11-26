package com.senaidev.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.livraria.entities.Endereco;

public interface EnderecoRepository extends JpaRepository <Endereco, Long> {

}
