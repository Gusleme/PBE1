package com.senaidev.cursoproduto.entities;

@Entity
@Table(name = "tb_curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = Generationtype.IDENTITY)
	private Long id_curso;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "carga_horaria")
	private double carga_horaria;
	
	@Column(name = "dificuldade")
	private int dificuldade;
	
	//Construtoes
	
	public Curso(Long id_curso, String descricao, String titulo, double carga_horaria, int dificuldade) {
		super();
		this.id_curso = id_curso;
		this.descricao = descricao;
		this.titulo = titulo;
		this.carga_horaria = carga_horaria;
		this.dificuldade = dificuldade;
	}

	//Getters e Setters
	
	public Long getId_curso() {
		return id_curso;
	}

	public void setId_curso(Long id_curso) {
		this.id_curso = id_curso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(double carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}
	
}
