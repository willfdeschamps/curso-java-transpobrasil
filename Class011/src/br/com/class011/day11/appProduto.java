package br.com.class011.day11;

import java.util.Scanner;

public class appProduto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroProdutos cadastro = new CadastroProdutos();
		cadastro.mostrarMenu(teclado);
		teclado.close();
	}

}
