package Zoologico;

public class Aplicacao{

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();
		pikachu.nome = "pikachu";
		pikachu.tipo = "eletrico";
		pikachu.hp = 100;
		pikachu.nivel = 20;
		Pokemon charmander = new Pokemon("charmander","Fogo",20,90);
		Pokemon Bulbassauro = new Pokemon("Bulbassauro","Planta",18,60);
		Pokemon pidgey = new Pokemon("pidgey","voador",25,100);
		Pokemon magicarp = new Pokemon("magicarp","Agua",22,95);
		
		pikachu.exibirInfo();
		pikachu.metodoAtacar();
		pikachu.metodoEvolucao();
		
		Bulbassauro.exibirInfo();
		Bulbassauro.metodoAtacar();
		Bulbassauro.metodoEvolucao();
		
		charmander.exibirInfo();
		charmander.metodoAtacar();
		charmander.metodoEvolucao();
		
		pidgey.exibirInfo();
		pidgey.metodoAtacar();
		pidgey.metodoEvolucao();
		
		magicarp.exibirInfo();
		magicarp.metodoAtacar();
		magicarp.metodoEvolucao();
	}
}
