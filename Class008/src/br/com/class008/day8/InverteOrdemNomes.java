package br.com.class008.day8;

import java.util.Scanner;

public class InverteOrdemNomes {

	public static void main(String[] args) {
		String[] nomes = new String[10];
		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Informe um nome");
			nomes[i] = keyboard.nextLine();
		}
		
		for (int i = nomes.length -1; i >= 0; i--) {
			System.out.println(nomes[i]);
		}
		keyboard.close();
	}

}
