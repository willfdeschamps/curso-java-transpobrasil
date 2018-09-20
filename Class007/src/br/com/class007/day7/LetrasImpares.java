package br.com.class007.day7;

import java.util.Scanner;

public class LetrasImpares {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe uma palavra");
		String string = keyboard.nextLine();
		for (int i = 1; i <= string.length()-1; i+=2) {
			System.out.printf("%s", string.charAt(i));
		}
		keyboard.close();

	}

}
