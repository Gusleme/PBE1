package com.senaidev.livraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_livro;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(nullable = false, length = 13, unique = true)
	private String isbn;
	
	@Column(nullable = false, length = 100)
	private String categoria;
	
	@Column
	private int estoque;

	public Livro(Long id_livro, String nome, String isbn, String categoria, int estoque) {
		super();
		this.id_livro = id_livro;
		this.nome = nome;
		this.isbn = isbn;
		this.categoria = categoria;
		this.estoque = estoque;
	}

	public Long getId_livro() {
		return id_livro;
	}

	public void setId_livro(Long id_livro) {
		this.id_livro = id_livro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
}
