package br.com.class019.day19;

public class TesteSingleton {
	private static Teste teste;
	
	private TesteSingleton() {
		
	}

	public static Teste getInstancia() {
		if(teste == null) {
			teste = new Teste();
		}
		return teste;
	}
}
