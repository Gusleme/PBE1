package com.senaidev.livraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.livraria.entities.Livro;
import com.senaidev.livraria.repositories.LivroRepository;

@Service
public class LivroService {
	 @Autowired
	    private LivroRepository livroRepository;

	    // Listar todos os livros
	    public List<Livro> buscarLivro() {
	        return livroRepository.findAll();
	    }

	    // Buscar livros por ID
	    public Livro buscarLivroPorId(Long id) {
	        return livroRepository.findById(id).orElse(null);
	    }
	    
	    // Buscar livros por Isbn
	    public Livro buscarLivroPorIsbn(String isbn) {
	    	return livroRepository.findByIsbn(isbn);
	    }

	    // Salvar livros
	    public Livro criarLivro(Livro livro) {
	        return livroRepository.save(livro);
	    }

	    // Deletar livros
	    public void excluirLivro(Long id) {
	        livroRepository.deleteById(id);
	    }

}
