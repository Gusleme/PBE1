package programacao_backend;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	System.out.println("quantos minutos ele ficou?");
	int minutos = leia.nextInt();
	double conta = 50.00;
	
	if(minutos > 100) {
	conta =	conta + ((minutos-100) * 2);
	//conta += (minutos-100) * 2;
	}
	System.out.println("o valor da conta é: " + conta);
	leia.close();
		}
}



