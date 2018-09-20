package br.com.class007.day7;

public class ImprimePiramide {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("X");
			}
			System.out.println("");
		}
	}

}
