package br.com.class019.day19;

import java.text.DateFormat;
import java.util.Date;

public class ExemploFormatDate {
	public static void main(String[] args) {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
		Date data = new Date(2018, 06, 28, 10,30);
		
		System.out.println(dateFormat.format(data));
	}
}
