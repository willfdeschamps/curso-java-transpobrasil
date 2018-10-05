package br.com.class014.day14;

import java.util.ArrayList;

public class VeiculoRepositorio {
	private ArrayList<Veiculo> listVeiculos = new ArrayList<>();
	private static int incrementoID = 0;
	
	public boolean adicionarVeiculo(Veiculo veiculo){
		boolean resultado = false;
		if(veiculo != null){
			veiculo.setId(incrementoID++);
			resultado = listVeiculos.add(veiculo);
			
		}
		return resultado;
	}
	
	public ArrayList<Veiculo> buscarTodos(){
		return listVeiculos;
	}
	
	public boolean removerVeiculo(int index) {
		return listVeiculos.remove(index) != null;
	}
}
