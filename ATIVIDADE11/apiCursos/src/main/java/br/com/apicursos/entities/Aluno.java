package com.senaidev.cursoproduto.entities;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = Generationtype.IDENTITY)
	private Long id_aluno;
	
	@Column(name = "nome_aluno")
	private String nome_aluno;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefone")
	private int telefone;
	
	@Column(name = "matricula")
	private int matricula;
	
	//Construtores
	
	public Aluno(Long id_aluno, String nome_aluno, String email, int telefone, int matricula) {
		super();
		this.id_aluno = id_aluno;
		this.nome_aluno = nome_aluno;
		this.email = email;
		this.telefone = telefone;
		this.matricula = matricula;
	}
	
	//Getters e Setters

	public Long getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Long id_aluno) {
		this.id_aluno = id_aluno;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
