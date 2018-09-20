package br.com.class007.day7;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite um número menos entre 1 e 20");
		int numero = Integer.parseInt(keyboard.nextLine());
		if(numero <= 20 && numero > 0) {
			long fatorial = 1;
			for (int i = 1; i <= numero; i++) {
				fatorial *= i;
			}
			System.out.printf("Fatorial de %d = %d", numero, fatorial);
		}
		keyboard.close();
	}

}
