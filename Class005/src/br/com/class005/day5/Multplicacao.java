package br.com.class005.day5;

import java.util.Scanner;

public class Multplicacao {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe um número");
		double g1 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe outro número");
		double g2 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Multplicação: " + (g1 * g2));
		keyboard.close();
	}

}
