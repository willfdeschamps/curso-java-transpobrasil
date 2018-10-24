package br.com.class019.day19;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExemploDateFormatComLocale {

	//A classe NumberFormat � utilizada para formata��o de numeros possuindo m�todos e atributos para tal funcionalidade
	//Ela � uma classe abstrata, sendo assim necessidade ser instancia obrigat�riamente atrav�s do m�todo getInstance
	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		Date data1 = new Date(2018, 06, 28, 10, 30);
		
		//M�todo getDataTimeInstance retorna uma instacia do pr�prio DateFormat formatada para Data e Tempo
		System.out.println("Data e hora----------------");
		System.out.println("Full: " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL).format(data1));
		System.out.println("LONG: " + DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(data1));
		System.out.println("MEDIUM: " + DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM).format(data1));
		System.out.println("SHORT: " + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(data1));
		
		//M�todo getDataInstance retorna uma instacia do pr�prio DateFormat formatada apenas para Data
		System.out.println("Somente Data---------------");
		System.out.println("FULL: " + DateFormat.getDateInstance(DateFormat.FULL).format(data1));
		System.out.println("LONG: " + DateFormat.getDateInstance(DateFormat.LONG).format(data1));
		System.out.println("MEDIUM: " + DateFormat.getDateInstance(DateFormat.MEDIUM).format(data1));
		System.out.println("SHORT: " + DateFormat.getDateInstance(DateFormat.SHORT).format(data1));
		
		//M�todo getTimeInstance retorna uma instacia do pr�prio DateFormat formatada apenas para Data
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
				System.out.println("Pa�s: " + locale.getDisplayCountry() + ", Idioma: " + locale.getDisplayLanguage()
						+ ", Simbolo: " + locale.getCountry());
			}

			System.out.println("Informe a sigla do local para formata��o:");
			sigla = teclado.nextLine();
			Locale local = new Locale(sigla);

			System.out.println("Formata��o do pa�s: " + local.getDisplayCountry());
			if (!sigla.equals("")) {
				System.out.println("Formata��o num�rica: " + DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, local).format(data1));
			}
			teclado.nextLine();
		} while (!sigla.equals(""));
		teclado.close();
	}

}


