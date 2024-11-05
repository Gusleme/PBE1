package com.senaidev.cursoproduto.entities;

@Entity
@Table(name = "tb_disciplina")
public class Disciplina {

	@Id
	@GeneratedValue(strategy = Generationtype.IDENTITY)
	private Long id_disciplina;
	
	@Column(name = "nome_disciplina")
	private String nome_disciplina;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "carga_horaria")
	private double carga_horaria;
	
	//Construtores
	
	public Disciplina(Long id_disciplina, String nome_disciplina, String descricao, double carga_horaria) {
		super();
		this.id_disciplina = id_disciplina;
		this.nome_disciplina = nome_disciplina;
		this.descricao = descricao;
		this.carga_horaria = carga_horaria;
	}

	//Getters e Setters
	
	public Long getId_disciplina() {
		return id_disciplina;
	}

	public void setId_disciplina(Long id_disciplina) {
		this.id_disciplina = id_disciplina;
	}

	public String getNome_disciplina() {
		return nome_disciplina;
	}

	public void setNome_disciplina(String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(double carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	
}
