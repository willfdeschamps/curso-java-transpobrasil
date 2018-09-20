package br.com.class007.day7;

import java.util.Scanner;

public class InverteString {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe uma palavra");
		String string = keyboard.nextLine();
		for (int i = string.length()-1; i >= 0; i--) {
			System.out.print(string.charAt(i));
			
		}
		keyboard.close();
	}

}
