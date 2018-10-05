package br.com.class017.day17;

public class PeixeVoador extends Peixe implements Voador{
	
	@Override
	public void voar() {
		System.out.println("Peixe Voando...");
	}
	
}
