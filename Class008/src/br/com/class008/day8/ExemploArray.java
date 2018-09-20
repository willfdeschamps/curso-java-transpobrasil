package br.com.class008.day8;

public class ExemploArray {

	public static void main(String[] args) {
		int[] numeros;
		String nomes[];
		numeros = new int[10];
		nomes = new String[3];
		
		String[] frutas = {"Abacaxi", "Banana", "Pêssego"};
		
		double[] medias = new double[3];
		int[] notas = new int[]{10, 9, 8, 10, 9, 8};
		int[] notas2 = {10, 9, 8, 10, 9, 8};
		notas = new int[]{100};
		int y = new int[] {10, 9, 8, 7}[1];
		
		for (int i = 0; i < notas2.length; i++) {
			System.out.println(notas[i] + " ");
		}
		
		for (int atual : notas2) {
			System.out.println(atual + " ");
		}
		System.out.println("");
		
		for (int i = 0; i < notas2.length; i++) {
			int atual = notas[i];
			System.out.print(atual + " ");
		}
		
	}
}
