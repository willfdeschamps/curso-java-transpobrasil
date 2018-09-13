package br.com.cursojava.day3;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform the firts grade");
		double number1 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Inform the second grade");
		double number2 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Inform the third grade");
		double number3 = Double.parseDouble(keyboard.nextLine());
		System.out.printf("The weighted avarege is: %.2f\n", (number1 * 0.2) + (number2 * 0.3) + (number3*0.5));
		keyboard.close();
	}

}
