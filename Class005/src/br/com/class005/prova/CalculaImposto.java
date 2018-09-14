package br.com.class005.prova;

import java.util.Scanner;

public class CalculaImposto {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe seu salário");
		double salary = Double.parseDouble(keyboard.nextLine());
		if(salary > 3600) {
			System.out.printf("Você deve pagar %f de imposto de renda\n", salary * 0.27);
		} else if (salary > 2400) {
			System.out.printf("Você deve pagar %f de imposto de renda\n", salary * 0.15);
		} else if (salary > 1800) {
			System.out.printf("Você deve pagar %f de imposto de renda\n", salary * 0.75);
		} else {
			System.out.println("Você é isento de imposto de renda");
		}
		keyboard.close();

	}

}
