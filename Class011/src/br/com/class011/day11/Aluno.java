package br.com.class011.day11;

public class Aluno {
	private String nome;
	private String telefone;
	private int matricula;
	
	
	public Aluno(String nome, String telefone, int matricula) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", telefone=" + telefone + ", matricula=" + matricula + "]";
	}
	
	
	
}
