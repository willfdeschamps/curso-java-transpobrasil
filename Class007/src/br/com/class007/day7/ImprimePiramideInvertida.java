package br.com.class007.day7;

public class ImprimePiramideInvertida {
	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}
}
