package br.com.class005.day5;

import java.util.Scanner;

public class Multplicacao {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe um n�mero");
		double g1 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe outro n�mero");
		double g2 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Multplica��o: " + (g1 * g2));
		keyboard.close();
	}

}
