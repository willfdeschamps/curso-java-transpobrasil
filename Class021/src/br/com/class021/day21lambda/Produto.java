package br.com.class021.day21lambda;

public class Produto implements Comparable<Produto>{
	private String nome;
	private double preco;
	
	public Produto() {
		super();
	}

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}

	@Override
	public int compareTo(Produto outro) {
		if(this.nome != null) {
			if(outro != null && outro.nome != null) {
				return this.nome.compareTo(outro.nome);
			} else {
				return -1;
			}
		}
		return 1;
	}
	
	
}
