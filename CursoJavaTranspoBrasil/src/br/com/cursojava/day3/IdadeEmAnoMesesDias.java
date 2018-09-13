package br.com.cursojava.day3;

import java.util.Scanner;

public class IdadeEmAnoMesesDias {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform your age in days");
		int input = Integer.parseInt(keyboard.nextLine());
		int years = input / 365;
		int months = (input % 365) / 30;
		int days = (input % 365 % 30);
		System.out.printf("Years %d\n", years);
		System.out.printf("Months %d\n", months);
		System.out.printf("Days %d\n", days); 
		keyboard.close();

	}

}
