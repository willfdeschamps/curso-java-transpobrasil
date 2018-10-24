package br.com.class030.day030;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ProdutoView cadastroProdutos = new ProdutoView();
		cadastroProdutos.carregaMenu(teclado);
		teclado.close();
	}

}
