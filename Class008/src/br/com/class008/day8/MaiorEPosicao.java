package br.com.class008.day8;

import java.util.Scanner;

public class MaiorEPosicao {

	public static void main(String[] args) {
		double[] notas = new double[5];
		Scanner keyboard = new Scanner(System.in);

		int posicaoMaior = 0;;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe uma nota");
			notas[i] = Double.parseDouble(keyboard.nextLine());
			
			if(notas[i] > notas[posicaoMaior]) {
				posicaoMaior = i;
			}
		}
		System.out.printf("Maior: %.2f, Posição: %d", notas[posicaoMaior], posicaoMaior);
		keyboard.close();

	}

}
