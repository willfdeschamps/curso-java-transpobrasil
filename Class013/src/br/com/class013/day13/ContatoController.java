package br.com.class013.day13;

import java.util.ArrayList;

public class ContatoController {
	private ContatoRepositorio repositorio = new ContatoRepositorio();
	
	public boolean adicionar(String nome, String email, String telefone){
			return repositorio.inserirContato(new Contato(nome, email, telefone));
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
