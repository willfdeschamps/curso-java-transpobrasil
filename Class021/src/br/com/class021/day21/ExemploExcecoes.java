package br.com.class021.day21;

import java.util.Scanner;

public class ExemploExcecoes {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = Integer.parseInt(keyboard.nextLine());
		System.out.println("O número digitado foi: " + numero);
		
		try {
			String[] nomes = {"João", "Maria"};
			System.out.println(nomes[2]);	
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Você tentou acessar uma posição inválida ou o valor informado não pode ser convertido para número!!");
		} 
		System.out.println("Código continuou normalmente");
		keyboard.close();

	}

}
