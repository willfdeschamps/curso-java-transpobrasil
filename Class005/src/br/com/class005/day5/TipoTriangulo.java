package br.com.class005.day5;

import java.util.Scanner;

public class TipoTriangulo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe a aresta 1");
		double aresta1 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe a aresta 2");
		double aresta2 = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe a aresta 3");
		double aresta3 = Double.parseDouble(keyboard.nextLine());
		if((aresta1 == aresta2) && (aresta1 == aresta3)) {
			System.out.println("Equilátero");
		} else if ((aresta1 == aresta2) || (aresta1 == aresta3)){
			System.out.println("Isóceles");
		} else {
			System.out.println("Escaleno");
		}

		keyboard.close();

	}

}
