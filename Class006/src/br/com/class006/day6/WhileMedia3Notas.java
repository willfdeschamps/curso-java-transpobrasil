package br.com.class006.day6;

import java.util.Scanner;

public class WhileMedia3Notas {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while (true){
			System.out.println("Imform the first grade");
			double g1 = Double.parseDouble(keyboard.nextLine());
			if(g1 < 0) {
				break;
			}
			System.out.println("Imform the second grade");
			double g2 = Double.parseDouble(keyboard.nextLine());
			System.out.println("Imform the third grade");
			double g3 = Double.parseDouble(keyboard.nextLine());
			
			System.out.println("Média = " + (g1 + g2 + g3) / 3);
			keyboard.nextLine();
		}
		keyboard.close();
		System.out.println("Programa encerrado");
		
	}

}
