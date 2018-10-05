package br.com.class015.day15;

import java.util.ArrayList;

public class ClienteController {
	public static int FILTRA_TIPO = 1;
	public static int FILTRA_CIDADE = 2;
	
	private ClienteRepositorio repositorio = new ClienteRepositorio();

	public boolean isNomeValido(String nome) {
		if (validaStringBranco(nome) && nome.trim().length() >= 3) {
			return true;
		}
		return false;
	}

	public boolean validaStringBranco(String valor) {
		if(valor != null && !"".equals(valor.trim())) {
			return true;
		}
		return false;
	}

	public boolean validaIntPositivo( int valor) {
		if(valor > 0) {
			return true;
		}
		return false;
	}
	
	
	
	public boolean adicionar(String nome, String telefone, String email, String tipo, Endereco endereco) {
		Cliente cliente = new Cliente();

		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		cliente.setTipo(tipo);
		cliente.setEndereco(endereco);
		return repositorio.adicionarCliente(cliente);
	}

	public Cliente getContatoAt(int index) {
		return repositorio.buscarTodos().get(index);
	}

	public ArrayList<Cliente> filtrar(String filtro, int opcao) {
		ArrayList<Cliente> todos = repositorio.buscarTodos();
		ArrayList<Cliente> lista = new ArrayList<>();
		if(filtro == null || filtro.equals("") || opcao <= 0) {
			return null;
		}
		for (Cliente cliente : todos) {
			if (opcao == FILTRA_TIPO) {
				if(cliente.getTipo() != null && !cliente.getTipo().trim().equals("") && cliente.getTipo().startsWith(filtro)) {
					lista.add(cliente);
				}
			} else if(opcao == FILTRA_CIDADE) {
				String cidade = cliente.getEndereco().getCidade();
				if(cidade != null && !cidade.trim().equals("") && cidade.startsWith(filtro)) {
					lista.add(cliente);
				}
			}
		}
		return lista;
	}

	public ArrayList<Cliente> listarClientes() {
		return repositorio.buscarTodos();
	}

	public boolean remover(int ID) {
		Cliente remover = null;
		for (Cliente cliente : repositorio.buscarTodos()) {
			if (cliente != null && cliente.getId().intValue() == ID) {
				remover = cliente;
			}
		}
		return repositorio.buscarTodos().remove(remover);
	}

	public boolean validaTipo(String tipo) {
		if(tipo.toUpperCase().equals("GOLD") || tipo.toUpperCase().equals("SILVER") || tipo.toUpperCase().equals("PLATINUM")) {
			return true;
		}
		return false;
	}

	public boolean validaEstado(String siglaEstado) {
		if(siglaEstado == null || siglaEstado.equals("") || siglaEstado.length() > 2 ) {
			return false;
		}
		String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", 
				            "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", 
				            "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		for (String siglaEstadoAtual : estados) {
			if(siglaEstadoAtual.equals(siglaEstado.toUpperCase())) {
				return true;
			}
		}
		return false;
	}
}
