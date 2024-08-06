package programacao_backend;

import java.util.Scanner;

public class atividade_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("qual o codigo da peça?");
		int cp1 = leia.nextInt();
		System.out.println("qual o numero de peças?");
		int np1 = leia.nextInt(); // numero de peças
		System.out.println("qual o valor unitario da peça?");
		double vp1 = leia.nextDouble();// valor da peça
		System.out.println("qual o codigo da peça?");
		int cp2 = leia.nextInt();
		System.out.println("qual o numero de peças?");
		int np2 = leia.nextInt(); // numero de peças
		System.out.println("qual o valor unitario da peça?");
		double vp2 = leia.nextDouble();// valor da peça
		System.out.print("o valor a ser pago pelas peças de codigo " + cp1 + " é de " + (np1*vp1) + " reais" );
		leia.close();

	}

}
