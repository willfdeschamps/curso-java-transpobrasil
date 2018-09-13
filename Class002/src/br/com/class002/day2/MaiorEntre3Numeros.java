package br.com.class002.day2;

public class MaiorEntre3Numeros {

	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 20;
		int numero3 = 15;
		System.out.printf("Maior: %d\n", Math.max(numero1, Math.max(numero2, numero3)));
	}
}
