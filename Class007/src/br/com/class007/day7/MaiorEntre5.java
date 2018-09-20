package br.com.class007.day7;

import java.util.Scanner;

public class MaiorEntre5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int maior = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número");
			maior = Math.max(maior, Integer.parseInt(keyboard.nextLine()));
		}
		System.out.println("Maior número: " + maior);
		keyboard.close();
	}

}
