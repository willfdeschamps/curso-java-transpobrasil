package br.com.class019.day19;

import java.util.Calendar;
import java.util.Date;

public class ExemploCalendar {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();	
		
		///Calendar calendar2 = Calendar.getInstance();
		
		//System.out.println(calendar.getTime()); // Get time retorna as informações da data atual do computador
		
		//Calendar.MONTH;
		//Calendar.YEAR;
		//Calendar.HOUR;
		//Calendar.SECOND
		
		
    //    calendar.roll(Calendar.DAY_OF_MONTH, 30); // Adiciona o valor do segundo paramentro no campo informado no primeiro parametro
//		
         // Retorna o valor do campo informado
//		
        //calendar.set(Calendar.YEAR, 2000); // Atribui o valor informado ao campo
//		
        //calendar.set(2018, 06, 28, 10, 30);
		Calendar calendar2 = Calendar.getInstance();
	
		calendar2.set(2018, 10, 05);
        //calendar.before();
		
		//calendar.roll(Calendar.DAY_OF_MONTH, 10);
		//System.out.println(calendar.getTime()); 
		
		
		

	}

}
