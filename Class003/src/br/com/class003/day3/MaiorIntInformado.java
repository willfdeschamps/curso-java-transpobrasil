package br.com.class003.day3;

import java.util.Scanner;

public class MaiorIntInformado {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform the firts number");
		int number1 = Integer.parseInt(keyboard.nextLine());
		System.out.println("Inform the second number");
		int number2 = Integer.parseInt(keyboard.nextLine());
		System.out.printf("The highest number typed was: %d", Math.max(number1, number2));
		keyboard.close();
	}

}
