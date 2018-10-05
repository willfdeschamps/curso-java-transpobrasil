package br.com.class011.day11;

public class Veiculo {

	private String marca;
	private String modelo;
	private String cor;
	private short anoFabrica��o;
	
	
	public Veiculo(String marca, String modelo, String cor, short anoFabrica��o) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabrica��o = anoFabrica��o;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public short getAnoFabrica��o() {
		return anoFabrica��o;
	}
	public void setAnoFabrica��o(short anoFabrica��o) {
		this.anoFabrica��o = anoFabrica��o;
	}
	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", anoFabrica��o=" + anoFabrica��o
				+ "]";
	}
	
	
}
