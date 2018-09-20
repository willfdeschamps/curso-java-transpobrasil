package br.com.class006.day6;

public class ImprimeNumerosPrimos {

	public static void main(String[] args) {
		int number = 1;
		while (number <= 50) {
			int divisor = 2;
			while (divisor <= number) {
				if(divisor == number) {
					System.out.println(number);
				}
				if(number % divisor == 0) {
					break;
				} 
				divisor++;
			}
			number++;
		}
	}

}
