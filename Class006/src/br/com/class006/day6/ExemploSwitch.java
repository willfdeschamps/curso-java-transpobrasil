package br.com.class006.day6;

import java.util.Scanner;

public class ExemploSwitch {
	private static final int SUNDAY = 1;
	private static final int MONDAY = 2;
	private static final int TUESDAY = 3;
	private static final int WEDNESDAY = 4;
	private static final int THURSDAY = 5;
	private static final int FRIDAY = 6;
	private static final int SATURDAY = 7;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 7");
		int day = Integer.parseInt(keyboard.nextLine());
		
		switch (day) {
		case SUNDAY:
			System.out.println("Sunday");
			break;
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday");
			break;
		case THURSDAY:
			System.out.println("Thursday");
			break;
		case FRIDAY:
			System.out.println("Friday");
			break;
		case SATURDAY:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("This isn´t a valid week day.");
			break;
		}
		keyboard.close();

	}

}
