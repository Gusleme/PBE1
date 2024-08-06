package prjCaneta;

public class Livro {
	String nomeLivro;
	String nomeAutor;
	boolean  alugado;
	
	public Livro (String nome, String autor) {
		this.nomeLivro = livro;
		this.nomeAutor = autor;
		this.alugado = false;
	}
	 void status() {
		 System.out.println("1. " + this.nomeLivro + ": " + (this.alugado ? "alugado":"disponivel"));
	 }
	 void alugado () {
		 this.alugado = true;
	 }
	 void devolver() {
		 this.alugado = false;
		 
	 }

}
