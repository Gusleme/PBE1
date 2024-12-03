package br.com.consultorio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.consultorio.entities.Paciente;
import br.com.consultorio.services.PacienteService;
@RestController
@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	private PacienteService pacienteService;
	
	@PostMapping
	public Paciente createPaciente(Paciente paciente) {
		
		return pacienteService.savePaciente(paciente);
	}
	
	@GetMapping
	public List<Paciente>getAllPaciente() {
		
		return pacienteService.getAllPaciente();
	}
	
	@GetMapping("/{id}")
	public Paciente getPaciente(@PathVariable Long id) {
		return pacienteService.getPacienteById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletePaciente(@PathVariable Long id) {
		pacienteService.deletePaciente(id);
	}
}
