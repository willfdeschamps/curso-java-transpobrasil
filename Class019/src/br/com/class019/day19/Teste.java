package br.com.class019.day19;

public class Teste {
	public int atributo;
	public static int atributoStatic;
	
	public void oi() {
		System.out.println("OI!!!!!!");
		System.out.println("O valor do atributo � " + atributo);
		System.out.println("O valor do atributo estatico � " + atributoStatic);
	}
	
	public static void hello() {
		System.out.println("Hello!!!!!!");
		//System.out.println("O valor do atributo � " + atributo); M�todos estaticos s� acessam atributos de estaticos
		System.out.println("O valor do atributo estatico � " + atributoStatic);
	
	}
}
