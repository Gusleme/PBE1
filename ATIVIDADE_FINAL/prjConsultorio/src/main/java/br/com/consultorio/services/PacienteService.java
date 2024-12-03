package br.com.consultorio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.consultorio.entities.Paciente;
import br.com.consultorio.repositories.PacienteRepository;

@Service
public class PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;

	public Paciente savePaciente(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}

	public List<Paciente> getAllPaciente() {
		return pacienteRepository.findAll();
	}

	public Paciente getPacienteById(Long id) {
		return pacienteRepository.findById(id).orElse(null);
	}

	public void deletePaciente(Long id) {
		pacienteRepository.deleteById(id);

	}

}
