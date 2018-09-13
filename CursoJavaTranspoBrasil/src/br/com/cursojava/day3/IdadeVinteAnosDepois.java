package br.com.cursojava.day3;

import java.util.Scanner;

public class IdadeVinteAnosDepois {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform your age");
		int age = Integer.parseInt(keyboard.nextLine());
		System.out.printf("In 20 years your age will be %d", age + 20);
		keyboard.close();
	}

}
