package br.com.class018.day18;

public class CalculadoraDesconto {

	public double aplicarDesconto(double valor) {
		if(valor < 0.0) {
			return 0.0;
		}
		double desconto = 0.0;
		if(valor > 3600) {
			desconto = 0.32;
		} else if(valor > 2400) {
			desconto = 0.22;
		} else if(valor > 1800) {
			desconto = 0.05;
		}
		
		return valor * (1 - desconto);
	}
}
