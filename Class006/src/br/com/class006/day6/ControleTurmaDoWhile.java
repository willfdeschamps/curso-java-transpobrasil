package br.com.class006.day6;

import java.util.Scanner;

public class ControleTurmaDoWhile {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int option = -1;
		System.out.println("Bem vindo ao controle de cadastramento");
		do {
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Cadastrar Profesor");
			System.out.println("3 - Cadastras Turma");

			option = Integer.parseInt(keyboard.nextLine());
			
			switch (option) {
			case 1:
				System.out.println("Escolheu a op��o Cadastrar Aluno");
				break;
			case 2:
				System.out.println("Escolheu a op��o Cadastrar Professor");
				break;
			case 3:
				System.out.println("Escolheu a op��o Cadastrar Turma");
				break;
			case 4:
				System.out.println("Fim da aplica��o");
				break;
			default:
				System.out.println("Op��o inv�lida");
			}
		} while (option != 4);
		keyboard.close();
		
	}
}
