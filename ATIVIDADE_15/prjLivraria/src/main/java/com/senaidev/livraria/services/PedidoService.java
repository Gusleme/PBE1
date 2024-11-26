package com.senaidev.livraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.livraria.entities.Pedido;
import com.senaidev.livraria.repositories.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;

	// Listar todos os pedidos
	public List<Pedido> buscarPedido() {
		return pedidoRepository.findAll();
	}

	// Buscar pedido por ID
	public Pedido buscarPedidoPorId(Long id) {
		return pedidoRepository.findById(id).orElse(null);
	}

	// Salvar pedido
	public Pedido criarPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	// Deletar pedido
	public void excluirPedido(Long id) {
		pedidoRepository.deleteById(id);
	}
}
