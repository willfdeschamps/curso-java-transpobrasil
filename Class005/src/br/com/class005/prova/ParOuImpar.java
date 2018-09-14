package br.com.class005.prova;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe um número");
		int number = Integer.parseInt(keyboard.nextLine());
		if((number % 2) == 0) {
			System.out.println("o número informado é par!");
		} else {
			System.out.println("o número informado é impar!");
		}
		keyboard.close();

	}

}
