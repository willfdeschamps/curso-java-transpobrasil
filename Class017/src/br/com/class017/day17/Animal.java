package br.com.class017.day17;

public abstract class Animal {
	
	public abstract void comer();
	
	public void respirar() {
		System.out.println(this.getClass().getSimpleName() + " respirando Oxigênio");
	}
}
