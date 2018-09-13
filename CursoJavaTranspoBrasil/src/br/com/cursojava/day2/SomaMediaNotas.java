package br.com.cursojava.day2;

public class SomaMediaNotas {

	public static void main(String[] args) {
		byte[] notas = new byte[10];
		notas[0] = 10;
		notas[1] = 7;
		notas[2] = 5;
		notas[3] = 9;
		notas[4] = 10;
		notas[5] = 7;
		notas[6] = 8;
		notas[7] = 10;
		notas[8] = 10;
		notas[9] = 10;
		int soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];	
		}
		System.out.printf("Soma: %d, Média: %.2f", soma, soma / ((float)(notas.length)));
	}

}
