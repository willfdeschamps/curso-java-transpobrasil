package br.com.class014.day14;

import java.util.ArrayList;

public class VeiculoController {
private VeiculoRepositorio repositorio = new VeiculoRepositorio();
	
	public boolean adicionar(String marca, String modelo, String placa, 
		                     int anoFabricacao, int anoModelo, String cor){
		boolean resultado = false;
		ArrayList<String> erros = new ArrayList<>();
		if(marca == null || "".equals(marca.trim()) || marca.length() < 3) {
			erros.add("A marca deve conter mais de 3 caracteres!");
		}
		
		if(modelo == null || "".equals(modelo.trim()) || modelo.length() < 3) {
			erros.add("O modelo deve conter mais de 3 caracteres!");
		}
		if(placa == null || "".equals(placa.trim()) || placa.length() != 7) {
			erros.add("A placa deve conter 7 caracteres!");
		}
		if(anoFabricacao < 2000) {
			erros.add("Só são permitidos veículos com ano de fabricação superior a 2000!");
		}
		
		if(anoModelo < anoFabricacao) {
			erros.add("O ano do modelo deve ser mais recente que o ano de fabricação");
		}
		for (String erro : erros) {
			System.out.println(erro);
		}
		if(erros.size() == 0) {
			resultado = repositorio.adicionarVeiculo(new Veiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor));
		}
		
		return resultado;
	}
	
	public Veiculo getContatoAt(int index){
		return repositorio.buscarTodos().get(index);
	}
	
	public ArrayList<Veiculo> filtrarPorMarca(String marca){
		ArrayList<Veiculo> todos = repositorio.buscarTodos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		for (Veiculo veiculo : todos) {
			if(veiculo != null && veiculo.getMarca() != null && veiculo.getMarca().startsWith(marca)) {
				lista.add(veiculo);
				break;
			}
		}
		return lista;
	}
	
	public ArrayList<Veiculo> filtrarPorModelo(String modelo){
		ArrayList<Veiculo> todos = repositorio.buscarTodos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		for (Veiculo veiculo : todos) {
			if(veiculo != null && veiculo.getModelo() != null && veiculo.getModelo().startsWith(modelo)) {
				lista.add(veiculo);
				break;
			}
		}
		return lista;
	}
	
	public ArrayList<Veiculo> filtrarPorPlaca(String placa){
		ArrayList<Veiculo> todos = repositorio.buscarTodos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		for (Veiculo veiculo : todos) {
			if(veiculo != null && veiculo.getPlaca() != null && veiculo.getPlaca().startsWith(placa)) {
				lista.add(veiculo);
				break;
			}
		}
		return lista;
	}
	
	public ArrayList<Veiculo> filtraPorAnoFabricacao(int anoFabricacao){
		ArrayList<Veiculo> todos = repositorio.buscarTodos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		for (Veiculo veiculo : todos) {
			if(veiculo != null && veiculo.getAnoFabricacao() == anoFabricacao) {
				lista.add(veiculo);
				break;
			}
		}
		return lista;
	}
	public ArrayList<Veiculo> listarContatos(){
		return repositorio.buscarTodos();
	}
	
	public boolean remover(int ID) {
		Veiculo remover = null;
		for (Veiculo veiculo : repositorio.buscarTodos()) {
			if(veiculo != null && veiculo.getId() == ID) {
				remover = veiculo;
			}
		}
		return repositorio.buscarTodos().remove(remover);
	}
}
