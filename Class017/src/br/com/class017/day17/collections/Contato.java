package br.com.class017.day17.collections;

public class Contato implements Comparable<Contato>{
	private String nome;
	private String email;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Contato() {
		super();
	}

	public Contato(String nome) {
		this();
		this.nome = nome;
	}
	
	public Contato(String nome, String email) {
		this(nome);
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Contato o) {
		if(nome == null && (o == null || o.nome == null)) {
			if(email != null) {
				return 1;
			}
			return 0;
		} else	if(o == null || o.nome == null) {
			return 1;
		} else if (nome == null){
			return -1;
		}
		
		int retorno = nome.compareTo(o.nome);
		if(retorno == 0) {
			retorno = email.compareTo(o.email);	
		}
		return retorno;
	}
}
