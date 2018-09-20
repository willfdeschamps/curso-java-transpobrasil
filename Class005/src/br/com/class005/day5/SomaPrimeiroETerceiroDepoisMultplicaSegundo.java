package br.com.class005.day5;

import java.util.Scanner;

public class SomaPrimeiroETerceiroDepoisMultplicaSegundo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe o primero número");
		double g1 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe o segundo número");
		double g2 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe o terceiro número");
		double g3 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Multplicação: " + ((g1 + g3) * g2));
		keyboard.close();
	}

}
