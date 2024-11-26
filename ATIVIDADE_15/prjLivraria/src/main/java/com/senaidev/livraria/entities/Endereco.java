package com.senaidev.livraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_editora;
	
	@Column(nullable = false, length = 100)
	private int rua;
	
	@Column(nullable = false)
	private String nm_casa;
	
	@Column(nullable = false, length = 100)
	private String bairro;
	
	@Column(nullable = false, length = 100)
	private String cidade;
	
	@Column(nullable = false, length = 2)
	private String estado;

	public Endereco(Long id_editora, int rua, String nm_casa, String bairro, String cidade, String estado) {
		super();
		this.id_editora = id_editora;
		this.rua = rua;
		this.nm_casa = nm_casa;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Long getId_editora() {
		return id_editora;
	}

	public void setId_editora(Long id_editora) {
		this.id_editora = id_editora;
	}

	public int getRua() {
		return rua;
	}

	public void setRua(int rua) {
		this.rua = rua;
	}

	public String getNm_casa() {
		return nm_casa;
	}

	public void setNm_casa(String nm_casa) {
		this.nm_casa = nm_casa;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
