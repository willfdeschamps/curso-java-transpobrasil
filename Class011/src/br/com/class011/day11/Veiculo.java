package br.com.class011.day11;

public class Veiculo {

	private String marca;
	private String modelo;
	private String cor;
	private short anoFabricação;
	
	
	public Veiculo(String marca, String modelo, String cor, short anoFabricação) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricação = anoFabricação;
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
	public short getAnoFabricação() {
		return anoFabricação;
	}
	public void setAnoFabricação(short anoFabricação) {
		this.anoFabricação = anoFabricação;
	}
	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", anoFabricação=" + anoFabricação
				+ "]";
	}
	
	
}
