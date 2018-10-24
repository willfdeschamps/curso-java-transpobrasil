package br.com.class021.day21;

import java.util.Scanner;

public class ExemploExcecoes {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int numero = Integer.parseInt(keyboard.nextLine());
		System.out.println("O n�mero digitado foi: " + numero);
		
		try {
			String[] nomes = {"Jo�o", "Maria"};
			System.out.println(nomes[2]);	
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Voc� tentou acessar uma posi��o inv�lida ou o valor informado n�o pode ser convertido para n�mero!!");
		} 
		System.out.println("C�digo continuou normalmente");
		keyboard.close();

	}

}
