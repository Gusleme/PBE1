package programacao_backend;

import java.util.Scanner;

public class atividade_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("qual seu numero?");
		int n = leia.nextInt(); // numero do funcionario
		System.out.println("quantas horas você trabalha?");
		int h = leia.nextInt(); // horas que o funcionario trabalha
		System.out.println("quanto você recebe por hora?");
		double r = leia.nextDouble(); // quanto ele recebe
		
		double s = h * r; // s = salario
		double sm = s * 30;
        System.out.print("O funcionario numero " + n);
        System.out.printf(" recebe um salario de %.2f  ", sm ,"  reais");
        leia.close();
	}

}
