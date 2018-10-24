package br.com.class019.day19;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExemploLocate {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a um n�mero");
		double numero = Double.parseDouble(teclado.nextLine());

		do {
			for (Locale locale : Locale.getAvailableLocales()) {
				System.out.println("Pa�s: " + locale.getDisplayCountry() + ", Idioma: " + locale.getDisplayLanguage()
						+ ", Simbolo: " + locale.getCountry());
			}

			System.out.println("Informe a sigla do local para formata��o:");
			String sigla = teclado.nextLine();
			Locale local = new Locale(sigla);

			System.out.println("Formata��o do pa�s: " + local.getDisplayCountry());
			if (numero != 0) {
				NumberFormat.getInstance(local);
				System.out.println(NumberFormat.getInstance().format(numero));
				System.out.println(NumberFormat.getCurrencyInstance().format(numero));
				System.out.println(NumberFormat.getIntegerInstance().format(numero));
				System.out.println(NumberFormat.getPercentInstance().format(numero));
			}
		} while (numero != 0);
		teclado.close();
	}
}
