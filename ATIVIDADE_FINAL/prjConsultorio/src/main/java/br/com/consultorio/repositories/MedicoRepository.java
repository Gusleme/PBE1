package br.com.consultorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.consultorio.entities.Medico;

public interface MedicoRepository extends JpaRepository <Medico, Long> {

}
