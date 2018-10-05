package br.com.class009.day9;

import java.util.Arrays;

public class Bazar {

	public static void main(String[] args) {
		int[][] valores = 
			   {{100, 200, 150}, // Jan
				{75, 260, 100},  // Fev
				{150, 200, 250}, // Mar
				{50, 210, 240}}; // Abri
		 //     meais camisas camisetas
		int qtdPecasVendidas = 0;
		int qtdMeiasVendidas = 0;
		int[] qtdVendidaMes = new int[valores.length];
		int[] qtdCamisasCamisetas = new int[valores.length];
		int[] posicaoMaisVendidoNoMes = new int[valores.length];
		String[] posicaoMaisVendidoNoMesString = new String[valores.length];
		int[] maiorVendidoNoMes = new int[valores.length];
		
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				qtdPecasVendidas += valores[i][j];
				if(j == 0) {
					qtdMeiasVendidas += valores[i][j];
				} else {
					qtdCamisasCamisetas[i] += valores[i][j];
				}
				if(maiorVendidoNoMes[i] < valores[i][j]) {
					maiorVendidoNoMes[i] = valores[i][j];
					posicaoMaisVendidoNoMes[i] = j;
				}
				qtdVendidaMes[i] += valores[i][j];
			}
		}
		for (int i = 0; i < posicaoMaisVendidoNoMes.length; i++) {
			switch (posicaoMaisVendidoNoMes[i]) {
			case 0:
				posicaoMaisVendidoNoMesString[i] = "Meias";
				break;
			case 1:
				posicaoMaisVendidoNoMesString[i] = "Camisas";
				break;
			case 2:
				posicaoMaisVendidoNoMesString[i] = "Camisetas";
				break;
			default:
				break;
			}
		}
		System.out.println("Quantidade de peças vendidas: " + qtdPecasVendidas);
		System.out.println("Quantidade de meias vendidas: " + qtdMeiasVendidas);
		System.out.println("Quantidade de peças vendidas mês a mês: " + Arrays.toString(qtdVendidaMes));
		System.out.println("Quantidade de camisas e camisetas: " + Arrays.toString(qtdCamisasCamisetas));
		System.out.println("Tipo mais vendido por mês: " + Arrays.toString(posicaoMaisVendidoNoMesString));
	}
	
}
