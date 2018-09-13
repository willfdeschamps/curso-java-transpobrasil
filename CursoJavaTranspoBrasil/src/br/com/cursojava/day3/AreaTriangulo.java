package br.com.cursojava.day3;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform the basis");
		double basis = Double.parseDouble(keyboard.nextLine());
		System.out.println("Inform the height");
		double height = Double.parseDouble(keyboard.nextLine());
		System.out.printf("The triangle area is: %f", basis * height / 2);
		keyboard.close();
	}

}
