package br.com.class005.prova;

import java.util.Scanner;

public class QuantidadeLetrasNome {

	public static void main(String[] args) {
		System.out.println("Informe seu nome completo");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		System.out.println(name.length());
		keyboard.close();
	}

}
