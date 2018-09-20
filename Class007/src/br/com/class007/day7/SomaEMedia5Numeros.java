package br.com.class007.day7;

import java.util.Scanner;

public class SomaEMedia5Numeros {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int soma = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número");
			soma += Integer.parseInt(keyboard.nextLine());
		}
		System.out.println("Soma dos números: " + soma);
		System.out.println("Média dos números: " + soma / 5.0);
		keyboard.close();

	}

}
