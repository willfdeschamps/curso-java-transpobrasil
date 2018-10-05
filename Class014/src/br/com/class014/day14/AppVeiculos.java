package br.com.class014.day14;

import java.util.Scanner;

public class AppVeiculos {

	public static void main(String[] args) {
		VeiculoView cadVeiculos = new VeiculoView();
		Scanner teclado = new Scanner(System.in);
		cadVeiculos.mostrarMenu(teclado);
		teclado.close();
	}

}
