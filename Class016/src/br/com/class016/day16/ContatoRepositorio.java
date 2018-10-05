package br.com.class016.day16;

import java.util.ArrayList;

import br.com.class016.day16.Contato;

public class ContatoRepositorio {
	private ArrayList<Contato> listContatos = new ArrayList<>();
	private static int incrementoID = 0;
	
	public boolean inserirContato(Contato contato){
		boolean resultado = false;
		if(contato != null){
				contato.setId(incrementoID);
				resultado = listContatos.add(contato);
			
		}
		return resultado;
	}
	
	public ArrayList<Contato> buscarTodos(){
		return listContatos;
	}
}
