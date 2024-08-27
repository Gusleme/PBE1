package Zoologico;

public class Pokemon {
	//Atributos
		String nome;
		String tipo;
		double hp;
		double nivel;
		//Construtores
		
		public Pokemon() {
			
		}
		public Pokemon(String parametroNome, String parametroTipo, double parametroNivel, double parametroHp) {
			this.nome = parametroNome;
			this.tipo = parametroTipo;
			this.nivel = parametroNivel;
			this.hp = parametroHp;
		}
		public void metodoEvolucao() {
				System.out.println(this.nome + " está evoluindo");
			}
			public void metodoAtacar() {
				System.out.println(this.nome + " atacou");

			}
			public void exibirInfo() {
				System.out.println("Nome: " + this.nome);
				System.out.println("Tipo: " + this.tipo);
				System.out.println("Hp: " + this.hp);
				System.out.println("Nivel: " + this.nivel);
			} 
		}
		