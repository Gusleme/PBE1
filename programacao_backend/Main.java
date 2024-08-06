package programacao_backend;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("insira um valor ");
		int v1 = leia.nextInt();
		System.out.println("insira outro valor ");
		int v2 = leia.nextInt();
		System.out.print("a soma dos vaores é igual a: " + (v1 + v2));

		leia.close();
	}

}
