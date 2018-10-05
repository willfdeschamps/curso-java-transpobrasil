package br.com.class018.day18;

public class ConversorFahrenheitCelsius {
	public double converteParaFahrenheit(double celsius) {
		return celsius * 1.8 + 32.0;
	}
	
	public double converteParaCelsius(double fahrenheit) {
		return ((fahrenheit - 32) / 1.8);
	}
	
	
	
}
