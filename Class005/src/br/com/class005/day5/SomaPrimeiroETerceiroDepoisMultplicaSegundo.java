package br.com.class005.day5;

import java.util.Scanner;

public class SomaPrimeiroETerceiroDepoisMultplicaSegundo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe o primero n�mero");
		double g1 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe o segundo n�mero");
		double g2 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe o terceiro n�mero");
		double g3 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Multplica��o: " + ((g1 + g3) * g2));
		keyboard.close();
	}

}
