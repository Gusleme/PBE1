package br.com.consultorio.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_paciente")
public class Paciente {

	// Atributo

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_paciente;

	@Column(name = "nome")
	private String nome;

	@Column(name = "email")
	private String email;

	@Column(name = "telefone")
	private String telefone;

	@Column(name = "dt_consulta")
	private Date dt_consulta;

	@ManyToOne
	@JoinColumn(name = "MEDICO_id_medico")
	private Medico medico;

	// Construtores

	public Paciente(Long id_paciente, String nome, String email, String telefone, Date dt_consulta) {
		super();
		this.id_paciente = id_paciente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dt_consulta = dt_consulta;
	}

	// Getters Setters
	public Long getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(Long id_paciente) {
		this.id_paciente = id_paciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Date getDt_consulta() {
		return dt_consulta;
	}

	public void setDt_consulta(Date dt_consulta) {
		this.dt_consulta = dt_consulta;
	}

}
