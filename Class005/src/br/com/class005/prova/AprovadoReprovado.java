package br.com.class005.prova;

import java.util.Scanner;

public class AprovadoReprovado {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Informe sua primeira nota");
		double g1 = Double.parseDouble(keyboard.nextLine());
		
		System.out.println("Informe sua segunda nota");
		double g2 = Double.parseDouble(keyboard.nextLine());
		
		System.out.println("Informe sua terceira");
		double g3 = Double.parseDouble(keyboard.nextLine());
		
		double average = (g1 + g2 + g3) / 3;
		if(average >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");	
		}
		
		keyboard.close();

	}

}
