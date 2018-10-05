package br.com.class015.day15;

import java.util.Scanner;

public class AppCliente {

	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		CadastroCliente cadCliente = new CadastroCliente();
		cadCliente.mostrarMenu(teclado);
		teclado.close();


	}

}
