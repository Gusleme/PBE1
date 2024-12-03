package br.com.consultorio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_medico")
public class Medico {

	// Atributos

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_medico;

	@Column(name = "nome")
	private String nome;

	@Column(name = "area_atuacao")
	private String area_atuacao;

	@Column(name = "email")
	private String email;

	@Column(name = "telefone")
	private String telefone;
	
	

	// Construtores

	public Medico(Long id_medico, String nome, String area_atuacao, String email, String telefone) {
		super();
		this.id_medico = id_medico;
		this.nome = nome;
		this.area_atuacao = area_atuacao;
		this.email = email;
		this.telefone = telefone;
	}

	// Getters Setters

	public Long getId_medico() {
		return id_medico;
	}

	public void setId_medico(Long id_medico) {
		this.id_medico = id_medico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea_atuacao() {
		return area_atuacao;
	}

	public void setArea_atuacao(String area_atuacao) {
		this.area_atuacao = area_atuacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
