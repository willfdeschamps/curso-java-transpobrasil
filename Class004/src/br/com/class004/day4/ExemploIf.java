package br.com.class004.day4;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform your age:");
		int age = Integer.parseInt(keyboard.nextLine());
		if (age > 65) {
			System.out.println("Você não é obrigado a votar!!!");	
		} else if(age >= 18) {
			System.out.println("Você é obrigado a votar!!!");
		} else if (age >= 16){
			System.out.println("Você não é obrigado a votar!!!");
		} else {
			System.out.println("Você não pode votar");
		}
		System.out.println("Fim da aplicação");
		keyboard.close();
	}

}
