package br.com.class003.day3;

import java.util.Scanner;

public class IdadeEmAnoMesesDias {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform your age in days");
		int input = Integer.parseInt(keyboard.nextLine());
		int years = input / 360;
		int months = (input % 360) / 30;
		int days = (input % 360 % 30);
		System.out.printf("Years %d\n", years);
		System.out.printf("Months %d\n", months);
		System.out.printf("Days %d\n", days); 
		keyboard.close();

	}

}
