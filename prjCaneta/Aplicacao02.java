package prjCaneta;

import java.util.Scanner;

public class Aplicacao02 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		Livro livro01 = new Livro("Alice no pais das maravilhas","Julio trigueiro");
		Livro livro02 = new Livro("Quarto de despejo","Pedro Francisco");
		
		System.out.println("Livros disponiveis");
		System.out.print("01. ");
		livro01.status();
		System.out.print("02. ");
		livro02.status();
		
		System.out.println("qual livro deseja alugar?");
		int escolha = leia.nextInt();
		 leia.close();
		

	}

}
