package br.com.class006.day6;

public class ImprimeNumeroPrimosDoWhile {

	public static void main(String[] args) {
		int number = 1;
		do {
			int divisor = 2;
			do  {
				if(divisor == number) {
					System.out.println(number);
				}
				if(number % divisor == 0) {
					break;
				} 
				divisor++;
			} while (divisor <= number);
			number++;
		} while (number <= 50);
	}

}
