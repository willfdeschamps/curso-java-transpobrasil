package br.com.class008.day8;

import java.util.Arrays;

public class OrdenaArray {

	public static void main(String[] args) {
		int[] array  = {1, 3, 2, 6, 7, 3, 1, 5, 25, 10, 1, 3, 2, 5, 15, 20, 7, 10};
		int[] array2 = {1, 3, 2, 6, 7, 3, 1, 5, 25, 10, 1, 3, 2, 5, 15, 20, 7, 10};
		int contaTroca1 = 0;
		int contaTroca2 = 0;
		for (int j = 0; j < array.length-1; j++) {
			for (int i = j+1; i < array.length; i++) {
				if(array[j] > array[i]) {
					int aux = array[j];
					array[j] = array[i];
					array[i] = aux;
					contaTroca1++;
				}
			}
		}
		
		for (int j = 0; j < array2.length-1; j++) {
			for (int i = 0; i < array2.length-1; i++) {
				if(array2[i] > array2[i+1]) {
					int aux = array2[i];
					array2[i] = array2[i+1];
					array2[i+1] = aux;
					contaTroca2++;
				}
			}
		}

		System.out.printf("Array1 Ordenado com %d trocas\n", contaTroca1);
		System.out.println(Arrays.toString(array));
		System.out.println("");
		System.out.printf("Array2 Ordenado com %d trocas\n", contaTroca2);
		System.out.println(Arrays.toString(array2));
		

	}

}
