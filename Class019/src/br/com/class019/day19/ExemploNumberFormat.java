package br.com.class019.day19;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;

public class ExemploNumberFormat {

	public static void main(String[] args) throws ParseException {
		NumberFormat numberFormat = NumberFormat.getInstance();
		NumberFormat numberFormat2 = NumberFormat.getInstance();
		Currency moeda = numberFormat.getCurrency();

		numberFormat = (NumberFormat) numberFormat2.clone();
		System.out.println(numberFormat.equals(numberFormat2));
		System.out.println(numberFormat.format(2000.51));
		
		Number num = numberFormat.parse("123123a5645365");
		System.out.println(num);
		numberFormat.getCurrency();
	
		
		

	}

}
