package br.com.class015.day15;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {
	private static final int SAIR = 6;
	ClienteController controller = new ClienteController();

	public void mostrarMenu(Scanner teclado) {		
		int opcao = 0;
		do {
			System.out.println("========== MENU PRINCIPAL ===========");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("3 - Listar clientes por tipo");
			System.out.println("4 - Listar clientes por cidade");
			System.out.println("5 - Remover cliente");
			System.out.println("6 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);

		} while (opcao != SAIR);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarCliente(teclado);
			break;
		case 2:
			listarClientes(null);
			break;
		case 3:
			filtrarClientes(teclado, "TIPO");
			break;
		case 4:
			filtrarClientes(teclado, "CIDADE");
			break;
		case 5:
			removerCliente(teclado);
			break;		
		case 6:
			System.out.println("Obrigado por utilizar nosso sistema :) ");
			break;
		default:
			System.out.println("Opção inválida");
		}

	}

	private void removerCliente(Scanner teclado) {
		System.out.println("========== REMOVER CLIENTE ===========");
		System.out.println("Informe o ID do cliente");
		int index = Integer.parseInt(teclado.nextLine());
		if (controller.remover(index)) {
			System.out.println("Cliente removido com sucesso!");
		} else {
			System.out.println("Cliente não encontrado!");
		}
	}

	private void cadastrarCliente(Scanner teclado) {
		System.out.println("========== CADASTRAR CLIENTE ===========");
		String nome;
		do {
			System.out.println("Nome: ");
			nome = teclado.nextLine();
		} while (!controller.isNomeValido(nome));

		System.out.println("Email: ");
		String email = teclado.nextLine();
		System.out.println("Telefone");
		String telefone = teclado.nextLine();

		String tipo;
		do {
			System.out.println("Tipo: Silver, Gold ou Platinum: ");
			tipo = teclado.nextLine();
		} while (!controller.validaTipo(tipo));

		System.out.println("========== CADASTRAR ENDEREÇO DO CLIENTE ===========");
		String rua;
		do {
			System.out.println("Rua:");
			rua = teclado.nextLine();
		} while (!controller.validaStringBranco(rua));

		int numero;
		do {
			System.out.println("Número:");
			numero = Integer.parseInt(teclado.nextLine());
		} while (!controller.validaIntPositivo(numero));

		String bairro;
		do {
			System.out.println("Bairro:");
			bairro = teclado.nextLine();
		} while (!controller.validaStringBranco(bairro));

		String cidade;
		do {
			System.out.println("Cidade:");
			cidade = teclado.nextLine();
		} while (!controller.validaStringBranco(cidade));

		String cep;
		do {
			System.out.println("CEP:");
			cep = teclado.nextLine();
		} while (!controller.validaStringBranco(cep));

		String siglaEstado;
		do {
			System.out.println("Sigla do estado:");
			siglaEstado = teclado.nextLine();
		} while (!controller.validaEstado(siglaEstado));

		System.out.println("Complemento:");
		String complemento = teclado.nextLine();

		Endereco endereco = new Endereco();
		endereco.setRua(rua);
		endereco.setNumero(numero);
		endereco.setComplemento(complemento);
		endereco.setBairro(bairro);
		endereco.setCidade(cidade);
		endereco.setEstado(siglaEstado);
		endereco.setCep(cep);

		boolean ok = controller.adicionar(nome, telefone, email, tipo, endereco);
		if (ok) {
			System.out.println("Cliente adicionado com sucesso!");
		} else {
			System.out.println("Não foi possível adicionar o cliente!");
		}
	}

	private void listarClientes(ArrayList<Cliente> clientes) {
		System.out.println("========== LISTA CLIENTES ===========");
		if (clientes == null) {
			clientes = controller.listarClientes();
		}
		System.out.println("ID | Nome - Telefone - Email - Tipo - Rua, n. Bairro - Cidade/UF - CEP. Complemento");
		for (Cliente cliente : clientes) {
			Endereco endereco = cliente.getEndereco();
			System.out.printf("%d | %s - %s - %s - %s - %s,%d. %s - %s/%s - %s. %s\n", cliente.getId(),
					cliente.getNome(), cliente.getTelefone(), cliente.getEmail(), cliente.getTipo(), endereco.getRua(),
					endereco.getNumero(), endereco.getBairro(), endereco.getCidade(), endereco.getEstado(),
					endereco.getCep(), endereco.getComplemento());
		}
	}

	private void filtrarClientes(Scanner teclado, String campo) {
		System.out.printf("Digite o %s: ", campo);
		Cliente cliente = new Cliente();
		System.out.println(cliente);
		String filtro = teclado.nextLine();
		ArrayList<Cliente> clientesFiltrados = null;
		if (campo.toUpperCase() == "TIPO") {
			clientesFiltrados = controller.filtrar(filtro, ClienteController.FILTRA_TIPO);
		} else if (campo.toUpperCase() == "CIDADE") {
			clientesFiltrados = controller.filtrar(filtro, ClienteController.FILTRA_CIDADE);
		}
		listarClientes(clientesFiltrados);

	}

}
