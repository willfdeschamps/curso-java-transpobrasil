package br.com.class005.day5;

import java.util.Scanner;

public class NivelNotaABCD {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe o primero número");
		double g1 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe o segundo número");
		double g2 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe o terceiro número");
		double g3 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Multplicação: " + ((g1 + g3) * g2));
		double avarege = (g1 + g2 + g3) / 3;
		
		if(avarege >= 9.0) {
			System.out.println("Conceito A");
		} else if(avarege >= 7.0) {
			System.out.println("Conceito B");
		} else if(avarege >= 6.0) {
			System.out.println("Conceito C");
		} else if(avarege >= 5.0) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito Insuficiente");
		}
		keyboard.close();

	}

}
