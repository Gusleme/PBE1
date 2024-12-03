package br.com.consultorio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.consultorio.entities.Medico;
import br.com.consultorio.services.MedicoService;
@RestController
@RequestMapping("/medico")
public class MedicoController {

	@Autowired
	private MedicoService medicoService;
	
	@PostMapping
	public Medico createMedico(Medico medico) {
		
		return medicoService.saveMedico(medico);
	}
	
	@GetMapping
	public List<Medico>getAllMedico() {
		
		return medicoService.getAllMedico();
	}
	
	@GetMapping("/{id}")
	public Medico getMedico(@PathVariable Long id) {
		return medicoService.getMedicoById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMedico(@PathVariable Long id) {
		medicoService.deleteMedico(id);
	}
}
