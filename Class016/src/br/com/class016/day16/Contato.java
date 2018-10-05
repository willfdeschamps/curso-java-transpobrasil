package br.com.class016.day16;

public class Contato extends Pessoa{

	Integer id;
	String email;
	String telefone;
	
	public Contato(Integer id, String email, String telefone, String nome, String codigo) {
		super(codigo, nome);
		this.id = id;
		this.email = email;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
