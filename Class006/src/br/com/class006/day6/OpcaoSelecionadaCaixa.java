package br.com.class006.day6;

import java.util.Scanner;

public class OpcaoSelecionadaCaixa {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("WELCOME TO OUR CASH MACHINE");
		System.out.println("Type a option, please");
		int option = Integer.parseInt(keyboard.nextLine());
		
		switch (option) {
		case 1:
			System.out.println("1 - Withdraw.");
			break;
		case 2:
			System.out.println("2 - Deposit.");
			break;
		case 3:
			System.out.println("3 - Verify balance.");
			break;
		default:
			System.out.println("![1-3] - Invalid option!");
			break;
		}
		keyboard.close();

	}

}
