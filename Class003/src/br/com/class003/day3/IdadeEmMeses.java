package br.com.class003.day3;

import java.util.Scanner;

public class IdadeEmMeses {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform your age");
		int age = Integer.parseInt(keyboard.nextLine());
		System.out.printf("Your age in months is %d", age * 12);
		keyboard.close();

	}

}
