package com.senaidev.livraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.livraria.entities.Editora;
import com.senaidev.livraria.repositories.EditoraRepository;

@Service
public class EditoraService {

	 @Autowired
	    private EditoraRepository editoraRepository;

	    // Listar todas as editoras
	    public List<Editora> buscarEditora() {
	        return editoraRepository.findAll();
	    }

	    // Buscar editora por ID
	    public Editora buscarEditoraPorId(Long id) {
	        return editoraRepository.findById(id).orElse(null);
	    }
	    
	    // Buscar editora por Cnpj
	    public Editora buscarEditoraPorCnpj(String cnpj) {
	    	return editoraRepository.findByCnpj(cnpj);
	    }

	    // Salvar editora
	    public Editora criarEditora(Editora editora) {
	        return editoraRepository.save(editora);
	    }

	    // Deletar editora
	    public void excluirEditora(Long id) {
	        editoraRepository.deleteById(id);
	    }
}
