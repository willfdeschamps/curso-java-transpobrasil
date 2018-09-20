package br.com.class008.day8;

import java.util.Scanner;

public class MediaENotas10 {

	public static void main(String[] args) {
		double[] notas = new double[10];
		Scanner keyboard = new Scanner(System.in);

		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe uma nota");
			notas[i] = Double.parseDouble(keyboard.nextLine());
			media += notas[i];
		}
		 
		System.out.println("Notas informadas:");
		for (double notaAtual : notas) {
			System.out.println(notaAtual);
		}	
		
		System.out.println("Média:" + (media/notas.length));
		keyboard.close();
	}

}
