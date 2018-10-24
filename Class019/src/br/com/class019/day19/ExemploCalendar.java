package br.com.class019.day19;

import java.util.Calendar;
import java.util.Date;

public class ExemploCalendar {
	//A Classe calendar foi inserida no Java 8 e t�m como objetivo ser uma classe mais robusta que a classe Date para tratamento de data
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //  
		System.out.println(cal.getTimeInMillis());
		Date data = new Date(cal.getTimeInMillis());
		System.out.println(data);

		//O m�todo add modifica o valor do campo informado e seus superiores(quando necess�rio)
		cal.add(Calendar.DAY_OF_MONTH, 30);
		System.out.println(cal.getTime());
		//O m�todo roll modifica apenas o valor do campo informado
		cal.roll(Calendar.DAY_OF_MONTH, 31);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.YEAR, 1);
		//M�todo After retorna se a instancia atual possui uma data posterior a instacia passada como par�metro
		System.out.println(cal.after(cal2));
		
		//M�todo Before retorna se a instancia atual possui uma data anterior a instacia passada como par�metro
		System.out.println(cal.before(cal2));
		
		System.out.println(cal.getTime());
		

	}

}
