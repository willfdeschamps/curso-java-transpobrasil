package br.com.class016.day16;

import java.util.ArrayList;

import br.com.class016.day16.Contato;

public class ContatoController {
	private ContatoRepositorio repositorio = new ContatoRepositorio();
	
	public boolean adicionar(String nome, String email, String telefone, String codigo){
			return repositorio.inserirContato(new Contato(null, nome, email, telefone, codigo));
	}
	
	public Contato getContatoAt(int index){
		ArrayList<Contato> contatos = repositorio.buscarTodos();
		return contatos.get(index);
	}
	
	public ArrayList<Contato> filtrarPorNome(String nome){
		ArrayList<Contato> todos = repositorio.buscarTodos();
		ArrayList<Contato> lista = new ArrayList<>();
		for (Contato contato : todos) {
			if(contato != null && contato.getNome() != null && contato.getNome().startsWith(nome)) {
				lista.add(contato);
				break;
			}
		}
		return lista;
	}
	
	public ArrayList<Contato> filtrarPorTelefone(String telefone){
		ArrayList<Contato> todos = repositorio.buscarTodos();
		ArrayList<Contato> lista = new ArrayList<>();
		for (Contato contato : todos) {
			if(contato != null && contato.getTelefone() != null && contato.getTelefone().startsWith(telefone)) {
				lista.add(contato);
				break;
			}
		}
		return lista;
	}
	
	public ArrayList<Contato> listarContatos(){
		return repositorio.buscarTodos();
	}
}
