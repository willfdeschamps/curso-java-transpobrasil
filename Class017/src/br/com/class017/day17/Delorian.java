package br.com.class017.day17;

public class Delorian extends Carro implements Turbinavel, Voador{

	@Override
	public void acionarTurbo() {
		System.out.println("Acionando turbo...");		
	}

	@Override
	public void desligarTurbo() {
		System.out.println("Desligando turbo...");
	}

	@Override
	public void voar() {
		System.out.println("Delorian voando...");
	}

}
