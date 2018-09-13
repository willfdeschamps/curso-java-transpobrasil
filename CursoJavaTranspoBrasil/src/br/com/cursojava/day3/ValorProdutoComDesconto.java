package br.com.cursojava.day3;

import java.util.Scanner;

public class ValorProdutoComDesconto {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Inform the price");
		double price = Double.parseDouble(keyboard.nextLine());
		System.out.println("Inform the discount");
		int discountPercentual = Integer.parseInt(keyboard.nextLine());
		System.out.printf("Discount %d%%, Total: %f", discountPercentual, price - (price * (discountPercentual / 100.0)));
		keyboard.close();

	}

}
