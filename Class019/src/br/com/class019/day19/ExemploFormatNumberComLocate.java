package br.com.class019.day19;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploFormatNumberComLocate {
	// A classe Locale � uma classe Java utilizada para extrair informa��es sobre pa�ses possuindo m�todos e atributos para tal funcionalidade
	// Ela sozinha basicamente retorna informa��es sobre os pa�ses, a grande vantagem de usar o locale � que
	// ele � usado em v�rios locais diferentes dentro da biblioteca do java para setar configura��es em fun��o da localiza��o
	
	//A classe NumberFormat � utilizada para formata��o de numeros possuindo m�todos e atributos para tal funcionalidade
	//Ela � uma classe abstrata, sendo assim necessidade ser instancia obrigat�riamente atrav�s do m�todo getInstance
	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a um n�mero");
		double numero = NumberFormat.getInstance().parse(teclado.nextLine()).doubleValue();
		String sigla = "";
		do {
			for (Locale locale : Locale.getAvailableLocales()) { //Local possui um m�todo est�tico que retorna todos paises e suas respectivas informa��es
				System.out.println("Pa�s: " + locale.getDisplayCountry() 
				        + ", Idioma: " + locale.getDisplayLanguage() 
						+ ", Variante : " + locale.getDisplayVariant() 
						+ ", Simbolo: " + locale.getLanguage());
			}

			System.out.println("Informe a sigla do local para formata��o:");
			sigla = teclado.nextLine();
			//Locale n�o � uma classe abstrata, local posso instancia-lo normalmente.
			//Pode ser instancia sem parametros, assim pegara as consigura��es padr�es do sistema
			//Tamb�m pode ser instanciado passando � linguagem, a linguagem e o pa�s ou a linguagem, o pa�s e a variante.

			Locale local = new Locale("en", sigla); 
			System.out.println(local.getDisplayCountry());
			System.out.println(sigla);
			System.out.println("Formata��o do pa�s: " + local.getDisplayCountry());
			if (!sigla.equals("")) {
				//getInstance retorna uma instacia do objeto NumberFormat 
				//Pode ser utilizado como ou sem par�metros, caso n�o sejam passados par�metros pegar� as informa��es do sistemas 
				
				System.out.println("Formata��o num�rica: " + NumberFormat.getInstance(local).format(numero));
				System.out.println("Formata��o mo�da: " + NumberFormat.getCurrencyInstance(local).format(numero));
				System.out.println("Formata��o inteiro: " +  NumberFormat.getIntegerInstance(local).format(numero));
				System.out.println("Formata��o percentual: " + NumberFormat.getPercentInstance(local).format(numero));
				
			}
			teclado.nextLine();
		} while (!sigla.equals(""));
		teclado.close();
	}
	
	
}


