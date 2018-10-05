package br.com.class016.day16;

public class Vendedor extends Funcionario{
	
	{
		System.out.println("Oi, eu sou o Goku!!!!");
	}
	public Vendedor() {
	}
	
	public Vendedor(String nome, String codigo, double salarioBase, double percentual, double totalVendas) {
		super(nome, codigo, salarioBase);
		System.out.println("Primeira linha depois do super()");
		setPercentual(percentual);
		setTotalVendas(totalVendas);
	}

	private double percentual;
	private double totalVendas;
	
	public double getPercentual() {
		return percentual;
	}

	
	public double getTotalVendas() {
		return totalVendas;
	}


	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}


	public void setPercentual(double percentual) {
		this.percentual = percentual > 1 ? percentual / 100 : percentual;
	}

	@Override
	public double salarioLiquido() {
		double acrescimo = 0;
		if(totalVendas >= 20000) {
			acrescimo = totalVendas * getPercentual();
		}
			return (this.getSalarioBase() + acrescimo) * 0.89;
	}
	
}
