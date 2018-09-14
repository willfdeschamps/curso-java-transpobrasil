package br.com.class005.prova;

import java.util.Scanner;

public class RemoveVogais {

	public static void main(String[] args) {
		System.out.println("Informe uma frase");
		Scanner keyboard = new Scanner(System.in);
		String phrase = keyboard.nextLine();
		phrase = phrase.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u", "");
		phrase = phrase.replaceAll("A", "").replaceAll("E", "").replaceAll("I", "").replaceAll("O", "").replaceAll("U", "");
		System.out.println(phrase);
		keyboard.close();
	}

}
