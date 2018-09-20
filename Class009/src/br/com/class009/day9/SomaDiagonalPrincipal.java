package br.com.class009.day9;

public class SomaDiagonalPrincipal {

	public static void main(String[] args) {
		int[][] matriz = {{10, 9, 8},
						  {07, 9, 10},
						  {10, 7, 8}};
		
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			soma += matriz[i][i];
		}
		soma = 0;
		
		System.out.println("Soma diagonal principal = " + soma);
		
		for (int i = matriz.length-1;  i >= 0 ; i++) {
			soma += matriz[matriz.length-1-i][i];
		}
		System.out.println("Soma diagonal secundaria = " + soma);
		
	}

}
