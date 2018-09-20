package br.com.class006.day6;

public class OperadoresCompostos {

	public static void main(String[] args) {
		int number = 10;
		int number2 = 5;
		number += number2;
		System.out.println(number);
		number -= number2;
		System.out.println(number);
		number *= number2;
		System.out.println(number);
		number /= number2;
		System.out.println(number);
		
		number %= number2;
		System.out.println(number);

		int n1 = 10;
		n1*= 2+8; // n1 = n1 * (8 + 2)
		System.out.println(n1);
	}

}
