package br.com.consultorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.consultorio.entities.Paciente;

public interface PacienteRepository extends JpaRepository <Paciente, Long>{

}
