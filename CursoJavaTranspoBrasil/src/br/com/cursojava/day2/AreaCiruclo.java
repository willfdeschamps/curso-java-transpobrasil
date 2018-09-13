package br.com.cursojava.day2;

public class AreaCiruclo {

	public static void main(String[] args) {
		byte diametro = 30;
		System.out.printf("Área do circulo: %.2f", Math.PI * Math.pow((diametro/2), 2));
	}
}
