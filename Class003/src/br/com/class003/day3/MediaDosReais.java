package br.com.class003.day3;

import java.util.Scanner;

public class MediaDosReais {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform the firts number");
		float number1 = Float.parseFloat(keyboard.nextLine());
		System.out.println("Inform the second number");
		float number2 = Float.parseFloat(keyboard.nextLine());
		System.out.println("Inform the third number");
		float number3 = Float.parseFloat(keyboard.nextLine());
		System.out.printf("The highest number is: %.2f", (number1 + number2 + number3) /3);
		keyboard.close();
	}
}
