package br.com.class003.day3;

import java.util.Scanner;

public class ExemploConversaoDados {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Digite um número");
//		String n1 = keyboard.nextLine();
//		System.out.println("Digite outro número");
//		String n2 = keyboard.nextLine();
//		System.out.println(n1 + n2);
//		System.out.println("Result: " + (Integer.parseInt(n1) + Integer.parseInt(n2)));
		System.out.println("Type the price of a product: ");
		double price = Double.parseDouble(keyboard.nextLine());
		double descont = 0.10;
		System.out.printf("The descont value is: %.2f", (price * descont));
		keyboard.close();
	}
}
