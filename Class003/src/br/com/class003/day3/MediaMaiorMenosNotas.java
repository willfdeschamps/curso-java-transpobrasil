package br.com.class003.day3;

import java.util.Scanner;

public class MediaMaiorMenosNotas {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform the firts grade");
		double number1 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Inform the second grade");
		double number2 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Inform the third grade");
		double number3 = Double.parseDouble(keyboard.nextLine());
		System.out.printf("The avarege is: %.2f\n", (number1 + number2 + number3) /3);
		System.out.printf("The highest is: %f\n", Math.max(number1, Math.max(number2, number3)));
		System.out.printf("The smaller is: %f\n", Math.min(number1, Math.min(number2, number3)));
		
		keyboard.close();
	}

}
