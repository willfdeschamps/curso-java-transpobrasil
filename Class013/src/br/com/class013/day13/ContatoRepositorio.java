package br.com.class013.day13;

import java.util.ArrayList;

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
