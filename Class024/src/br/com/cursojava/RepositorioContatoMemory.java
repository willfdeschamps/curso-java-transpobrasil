package br.com.cursojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RepositorioContatoMemory implements RepositorioContato{
	
	List<Contato> listContatos;
	
	public RepositorioContatoMemory() {
		listContatos = new ArrayList<>();
	}
	@Override
	public boolean adicionar(Contato contato) {
		validaContato(contato);
		if(buscarPorId(contato.getId()) != null) {
			return false;
		}
		return listContatos.add(contato);
	}
	
	@Override
	public boolean editar(Contato contato) {
		validaContato(contato);
		int index = listContatos.indexOf(contato);
		listContatos.set(index, contato);
		Contato editado = buscarPorId(contato.getId());
		if(contato.getNome() == editado.getNome() &&
		   contato.getEmail() == editado.getEmail()	&&
		   contato.getTelefone() == editado.getTelefone() &&
		   contato.getTipo() == editado.getTipo()) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<Contato> buscarTodos() {
		return listContatos;
	}
	
	@Override
	public List<Contato> buscarPorNome(String nome) {
		validaString(nome);
		return  listContatos
				.stream()
				.filter(c -> c.getNome().equals(nome))
				.collect(Collectors.toList());
	}

	
	@Override
	public List<Contato> buscarPorTelefone(String telefone) {
		validaString(telefone);
		return  listContatos
				.stream()
				.filter(c -> c.getTelefone().equals(telefone))
				.collect(Collectors.toList());
	}

	@Override
	public List<Contato> buscarPorTipo(TipoContato tipo) {
		if(tipo == null) {
			throw new IllegalArgumentException("Argumento tipo nulo!");
		}
		return  listContatos
				.stream()
				.filter(c -> c.getTipo() == tipo)
				.collect(Collectors.toList());
	}

	@Override
	public Contato buscarPorId(Integer id) {
		validaId(id);
		Optional<Contato> optionalContato;
		optionalContato = listContatos.stream().filter(c -> c.getId() == id).findFirst();
		if(optionalContato.isPresent()) {
			return optionalContato.get();
		}
		return null;
	}

	@Override
	public boolean remover(Contato contato) {
		validaContato(contato);
		return listContatos.remove(contato);
	}
	
	public void validaContato(Contato contato) {
		if(contato == null) {
			throw new IllegalArgumentException("Argumento Contato nulo!");
		}
		validaId(contato.getId());
	}
	
	public void validaString(String string) {
		if(string == null || string == "") {
			throw new IllegalArgumentException("String nula ou em branco!");
		}
	}
	
	private void validaId(Integer id) {
		if(id == null || id <= 0) {
			throw new IllegalArgumentException("Argumento id inferior a zero ou nulo!");
		}
	}
}
