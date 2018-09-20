package br.com.class007.day7;

public class ExemploFor {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("");
		int i = 10;
		for (; i >= 1; i--) {
			System.out.printf("%d", i);
		}
		System.out.println();
		
		for (; i <= 10;) {
			System.out.printf("%d", i);
			i++;
		}
		System.out.println();
		for (;;) {
			System.out.printf("%d", i);
			i--;
			if(i == 0) {
				break;
			}
		}
		System.out.println("\n Fim da aplicação");
		
	}
}
