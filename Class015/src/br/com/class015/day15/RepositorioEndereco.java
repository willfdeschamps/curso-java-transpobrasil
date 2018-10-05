package br.com.class015.day15;

import java.util.ArrayList;

public class RepositorioEndereco {
	private ArrayList<Endereco> listEnderecos = new ArrayList<>();
	
	public boolean adicionarEndereco(Endereco endereco){
		boolean resultado = false;
		if(endereco != null){
			resultado = listEnderecos.add(endereco);
		}
		return resultado;
	}
	
	public ArrayList<Endereco> buscarTodos(){
		return listEnderecos;
	}
	
	public boolean removerVeiculo(int index) {
		return listEnderecos.remove(index) != null;
	}
}
