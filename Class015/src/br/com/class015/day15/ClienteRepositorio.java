package br.com.class015.day15;

import java.util.ArrayList;


public class ClienteRepositorio {
	private ArrayList<Cliente> listClientes = new ArrayList<>();
	private static int incrementoID = 100;
	
	public boolean adicionarCliente(Cliente cliente){
		boolean resultado = false;
		if(cliente != null){
			cliente.setId(incrementoID++);
			resultado = listClientes.add(cliente);
			
		}
		return resultado;
	}
	
	public ArrayList<Cliente> buscarTodos(){
		return listClientes;
	}
	
	public boolean removerVeiculo(int index) {
		return listClientes.remove(index) != null;
	}
}
