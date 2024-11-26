package com.senaidev.livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.livraria.entities.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido, Long>{
	
}
