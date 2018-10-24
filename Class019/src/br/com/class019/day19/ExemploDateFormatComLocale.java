package br.com.class019.day19;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExemploDateFormatComLocale {

	//A classe NumberFormat é utilizada para formatação de numeros possuindo métodos e atributos para tal funcionalidade
	//Ela é uma classe abstrata, sendo assim necessidade ser instancia obrigatóriamente através do método getInstance
	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		Date data1 = new Date(2018, 06, 28, 10, 30);
		
		//Método getDataTimeInstance retorna uma instacia do próprio DateFormat formatada para Data e Tempo
		System.out.println("Data e hora----------------");
		System.out.println("Full: " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL).format(data1));
		System.out.println("LONG: " + DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(data1));
		System.out.println("MEDIUM: " + DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM).format(data1));
		System.out.println("SHORT: " + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(data1));
		
		//Método getDataInstance retorna uma instacia do próprio DateFormat formatada apenas para Data
		System.out.println("Somente Data---------------");
		System.out.println("FULL: " + DateFormat.getDateInstance(DateFormat.FULL).format(data1));
		System.out.println("LONG: " + DateFormat.getDateInstance(DateFormat.LONG).format(data1));
		System.out.println("MEDIUM: " + DateFormat.getDateInstance(DateFormat.MEDIUM).format(data1));
		System.out.println("SHORT: " + DateFormat.getDateInstance(DateFormat.SHORT).format(data1));
		
		//Método getTimeInstance retorna uma instacia do próprio DateFormat formatada apenas para Data
		System.out.println("Somente Hora----------------");
		System.out.println("FULL: " + DateFormat.getTimeInstance(DateFormat.FULL).format(data1));
		System.out.println("LONG: " + DateFormat.getTimeInstance(DateFormat.LONG).format(data1));
		System.out.println("MEDIUM: " + DateFormat.getTimeInstance(DateFormat.MEDIUM).format(data1));
		System.out.println("SHORT: " + DateFormat.getTimeInstance(DateFormat.SHORT).format(data1));
		
		String sigla = "";
		
		///Data com locale
		Scanner teclado = new Scanner(System.in);
		do {
			for (Locale locale : Locale.getAvailableLocales()) {
				System.out.println("País: " + locale.getDisplayCountry() + ", Idioma: " + locale.getDisplayLanguage()
						+ ", Simbolo: " + locale.getCountry());
			}

			System.out.println("Informe a sigla do local para formatação:");
			sigla = teclado.nextLine();
			Locale local = new Locale(sigla);

			System.out.println("Formatação do país: " + local.getDisplayCountry());
			if (!sigla.equals("")) {
				System.out.println("Formatação numérica: " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, local).format(data1));
			}
			teclado.nextLine();
		} while (!sigla.equals(""));
		teclado.close();
	}

}


