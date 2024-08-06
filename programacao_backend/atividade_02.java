package programacao_backend;

import java.util.Scanner;

public class atividade_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double pi = 3.14159;
		double a = 0; // area do circulo
		
		System.out.println("Qual o raio do circulo");
		double r = leia.nextDouble(); // raio do circulo
		a = pi*r*r; //calculo da area do circulo
		System.out.printf("a area do circulo é igual á %.4f ", a);
		leia.close();

	}

}
