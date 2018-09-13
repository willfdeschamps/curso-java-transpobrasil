package br.com.class002.day2;

public class Absoluto {

	public static void main(String[] args) {
		int[] numeros = new int[4];
		numeros[0] = -10;
		numeros[1] = 20;
		numeros[2] = 50;
		numeros[3] = -1000;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Número %d absoluto: %d\n", i+1, Math.abs(numeros[i]));	
		}
		
		
	}

}
