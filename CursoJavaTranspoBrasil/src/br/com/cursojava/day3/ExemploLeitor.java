package br.com.cursojava.day3;

import java.util.Scanner;

public class ExemploLeitor {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		String text = keyboard.nextLine();
		System.out.printf("Nome digitado: %s", text);
		keyboard.close();
	}

}
