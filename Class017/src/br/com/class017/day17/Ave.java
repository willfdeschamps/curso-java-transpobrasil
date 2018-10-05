package br.com.class017.day17;

public class Ave extends Animal implements Voador{
	
	@Override
	public void comer() {
		System.out.println("Ave comendo...");
	}
	
	@Override
	public void voar() {
		System.out.println("Ave voando");
	}
}
