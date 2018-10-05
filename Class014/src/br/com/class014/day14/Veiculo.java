package br.com.class014.day14;

public class Veiculo {
	Integer id;
	String marca;
	String modelo;
	String placa;
	int anoFabricacao;
	int anoModelo;
	String cor;
	
	
	public Veiculo() {
	}
	public Veiculo(String marca, String modelo, String placa, 
			       int anoFabricacao, int anoModelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.cor = cor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", anoFabricacao="
				+ anoFabricacao + ", anoModelo=" + anoModelo + ", cor=" + cor + "]";
	}
	
	
	
}
