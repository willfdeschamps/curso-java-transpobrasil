package br.com.class005.day5;

import java.util.Scanner;

public class NivelNota {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe o primero n�mero");
		double g1 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe o segundo n�mero");
		double g2 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe o terceiro n�mero");
		double g3 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Multplica��o: " + ((g1 + g3) * g2));
		double avarege = (g1 + g2 + g3) / 3;
		
		if(avarege >= 9.0) {
			System.out.println("Excelente");
		} else if(avarege >= 8.0) {
			System.out.println("Muito Bom");
		} else if(avarege >= 6.0) {
			System.out.println("Bom");
		} else {
			System.out.println("Insuficiente");
		}
		keyboard.close();

	}

}
