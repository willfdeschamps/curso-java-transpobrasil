package br.com.class003.day3;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform your weight");
		double weight = Double.parseDouble(keyboard.nextLine());
		System.out.println("Inform your height");
		double height = Double.parseDouble(keyboard.nextLine());
		System.out.printf("Your BMI is: %.2f", weight / (height * height));
		keyboard.close();

	}

}
