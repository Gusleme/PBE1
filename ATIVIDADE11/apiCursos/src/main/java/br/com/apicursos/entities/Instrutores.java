package com.senaidev.cursoproduto.entities;

@Entity
@Table(name = "tb_instrutores")
public class Instrutores {

	@Id
	@GeneratedValue(strategy = Generationtype.IDENTITY)
	private Long id_instrutores;
	
	@Column(name = "nome_instrutores")
	private String nome_instrutores;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefone")
	private int telefone;
	
	@Column(name = "area_especializada")
	private String area_especializada;
	
	@Column(name = "experiencia")
	private String experiencia;
	
	//Construtores
	
	public Instrutores(Long id_instrutores, String nome_instrutores, String email, int telefone, String area_especializada, String experiencia) {
		super();
		this.id_instrutores = id_instrutores;
		this.nome_instrutores = nome_instrutores;
		this.email = email;
		this.telefone = telefone;
		this.area_especializada = area_especializada;
		this.experiencia = experiencia;
	}

	//Getters e Setters
	
	public Long getId_instrutores() {
		return id_instrutores;
	}

	public void setId_instrutores(Long id_instrutores) {
		this.id_instrutores = id_instrutores;
	}

	public String getNome_instrutores() {
		return nome_instrutores;
	}

	public void setNome_instrutores(String nome_instrutores) {
		this.nome_instrutores = nome_instrutores;
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

	public String getArea_especializada() {
		return area_especializada;
	}

	public void setArea_especializada(String area_especializada) {
		this.area_especializada = area_especializada;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
}
