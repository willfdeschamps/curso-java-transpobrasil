package br.com.class019.day19;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploFormatNumberComLocate {
	// A classe Locale é uma classe Java utilizada para extrair informações sobre países possuindo métodos e atributos para tal funcionalidade
	// Ela sozinha basicamente retorna informações sobre os países, a grande vantagem de usar o locale é que
	// ele é usado em vários locais diferentes dentro da biblioteca do java para setar configurações em função da localização
	
	//A classe NumberFormat é utilizada para formatação de numeros possuindo métodos e atributos para tal funcionalidade
	//Ela é uma classe abstrata, sendo assim necessidade ser instancia obrigatóriamente através do método getInstance
	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a um número");
		double numero = NumberFormat.getInstance().parse(teclado.nextLine()).doubleValue();
		String sigla = "";
		do {
			for (Locale locale : Locale.getAvailableLocales()) { //Local possui um método estático que retorna todos paises e suas respectivas informações
				System.out.println("País: " + locale.getDisplayCountry() 
				        + ", Idioma: " + locale.getDisplayLanguage() 
						+ ", Variante : " + locale.getDisplayVariant() 
						+ ", Simbolo: " + locale.getLanguage());
			}

			System.out.println("Informe a sigla do local para formatação:");
			sigla = teclado.nextLine();
			//Locale não é uma classe abstrata, local posso instancia-lo normalmente.
			//Pode ser instancia sem parametros, assim pegara as consigurações padrões do sistema
			//Também pode ser instanciado passando à linguagem, a linguagem e o país ou a linguagem, o país e a variante.

			Locale local = new Locale("en", sigla); 
			System.out.println(local.getDisplayCountry());
			System.out.println(sigla);
			System.out.println("Formatação do país: " + local.getDisplayCountry());
			if (!sigla.equals("")) {
				//getInstance retorna uma instacia do objeto NumberFormat 
				//Pode ser utilizado como ou sem parâmetros, caso não sejam passados parâmetros pegará as informações do sistemas 
				
				System.out.println("Formatação numérica: " + NumberFormat.getInstance(local).format(numero));
				System.out.println("Formatação moéda: " + NumberFormat.getCurrencyInstance(local).format(numero));
				System.out.println("Formatação inteiro: " +  NumberFormat.getIntegerInstance(local).format(numero));
				System.out.println("Formatação percentual: " + NumberFormat.getPercentInstance(local).format(numero));
				
			}
			teclado.nextLine();
		} while (!sigla.equals(""));
		teclado.close();
	}
	
	
}


