package com.senaidev.cursoproduto.entities;

@Entity
@Table(name = "tb_turmas")
public class Turmas {

	@Id
	@GeneratedValue(strategy = Generationtype.IDENTITY)
	private Long id_turmas;
	
	@Column(name = "data_inicio")
	private date data_inicio;
	
	@Column(name = "data_termino")
	private date data_termino;
	
	@Column(name = "horario_aula")
	private int horario_aula;
	
	@Column(name = "vagas_disponiveis")
	private int vagas_disponiveis;
	
	//Construtores
	
	public Turmas(Long id_turmas, date data_inicio, date data_termino, int horario_aula, int vagas_disponiveis) {
		super();
		this.id_turmas = id_turmas;
		this.data_inicio = data_inicio;
		this.data_termino = data_termino;
		this.horario_aula = horario_aula;
		this.vagas_disponiveis = vagas_disponiveis;
	}

	//Getters e Setters
	
	public Long getId_turmas() {
		return id_turmas;
	}

	public void setId_turmas(Long id_turmas) {
		this.id_turmas = id_turmas;
	}

	public date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public date getData_termino() {
		return data_termino;
	}

	public void setData_termino(date data_termino) {
		this.data_termino = data_termino;
	}

	public int getHorario_aula() {
		return horario_aula;
	}

	public void setHorario_aula(int horario_aula) {
		this.horario_aula = horario_aula;
	}

	public int getVagas_disponiveis() {
		return vagas_disponiveis;
	}

	public void setVagas_disponiveis(int vagas_disponiveis) {
		this.vagas_disponiveis = vagas_disponiveis;
	}
	
}
