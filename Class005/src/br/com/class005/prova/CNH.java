package br.com.class005.prova;

import java.util.Scanner;

public class CNH {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe sua idade");
		int age = Integer.parseInt(keyboard.nextLine());
		if(age >= 18) {
			System.out.println("Você já pode tirar a CNH!");
		} else {
			System.out.printf("Você precisa esperar %d anos para tirar a CNH!", 18 - age);
		}
		keyboard.close();

	}

}
