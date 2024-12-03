package br.com.consultorio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.consultorio.entities.Medico;
import br.com.consultorio.repositories.MedicoRepository;

@Service
public class MedicoService {

	@Autowired
	
	private MedicoRepository medicoRepository;
	
	public Medico saveMedico(Medico medico) {
		return medicoRepository.save(medico);
	}

	public List<Medico> getAllMedico() {
		return medicoRepository.findAll();
	}

	public Medico getMedicoById(Long id) {
		return medicoRepository.findById(id).orElse(null);
	}

	public void deleteMedico(Long id) {
		medicoRepository.deleteById(id);

	}
}
