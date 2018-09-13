package br.com.class002.day2;

public class ExemploOperadoresMatematicos {

	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 3;
		System.out.println("Adição +");
		System.out.printf("%d + %d = %d\n", numero1, numero2, numero1 + numero2);				
		System.out.println("Subtração -");
		System.out.printf("%d - %d = %d\n", numero1, numero2, numero1 - numero2);
		System.out.println("Multiplicação *");
		System.out.printf("%d * %d = %d\n", numero1, numero2, numero1 * numero2);
		System.out.println("Divisão /");
		System.out.printf("%d / %f = %f\n", numero1, 3.0, numero1 / Double.parseDouble(""+numero2));
		System.out.println("Módulo %");
		System.out.printf("%d %% %d = %d\n", numero1, numero2, numero1 % 3);
	}

}
