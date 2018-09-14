package br.com.class005.prova;

import java.util.Scanner;

public class ICMComResultado {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Informe seu peso");
		double weight = Double.parseDouble(keyboard.nextLine());
		System.out.println("Informe sua altura");
		double height = Double.parseDouble(keyboard.nextLine());
		double BMI = weight / (height * height);
		
		if (BMI < 17.0) {
			System.out.println("Muito abaixo do peso");
		} else if(BMI < 18.5){
			System.out.println("Abaixo do peso");
		} else if (BMI < 25.0) {
			System.out.println("Peso normal");
		} else if (BMI < 30.0) {
			System.out.println("Acima do peso");
		} else if (BMI < 35.0) {
			System.out.println("Obesidade I");
		} else if (BMI < 40.0) {
			System.out.println("Obesidade II (Severa)");
		} else {
			System.out.println("Obesidade III (Mórvida)");
		}
		keyboard.close();

	}

}
