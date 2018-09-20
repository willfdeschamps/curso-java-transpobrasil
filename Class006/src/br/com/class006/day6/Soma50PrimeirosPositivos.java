package br.com.class006.day6;

public class Soma50PrimeirosPositivos {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 50) {
			sum += i++;
		}
		System.out.println("Soma dos primeiros 50 números = " + sum);
	}

}
