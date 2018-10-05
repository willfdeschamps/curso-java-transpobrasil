package br.com.class016.day16;

public class Funcionario {
	private String nome;
	private String codigo;
	private double salarioBase;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, String codigo, double salarioBase) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.salarioBase = salarioBase;
		System.out.println("Executou ");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double salarioLiquido() {
		return getSalarioBase() * 0.89; //Menos 11%
	}
}
