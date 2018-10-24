package br.com.class021.day21lambda;

public class ExemploClasseAnonima {

	public static void main(String[] args) {
		Voador v1 = new Aviao(){
			public void teste() {
				System.out.println("TESTE");
			}
		};
		
		v1.voar();
		
		Voador v2 = new Voador() {
			public void voar() {
				System.out.println("Voador Anonimo");
			}; 
		};
		
		v2.voar();
		liberarVoo(new Voador() {
			public void voar() {}; 
		});
	}
	
	private static void liberarVoo(Voador voador) {
		voador.voar();
	}

}
