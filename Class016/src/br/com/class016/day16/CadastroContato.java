package br.com.class016.day16;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.class016.day16.Contato;

public class CadastroContato {
	private static final int SAIR = 5;
	ContatoController controller = new ContatoController();

	public void mostrarMenu(Scanner teclado) {

		int opcao = 0;
		do {
			System.out.println("========== MENU PRINCIPAL ===========");
			System.out.println("1 - Cadastrar Veículo");
			System.out.println("2 - Listar Veículos");
			System.out.println("3 - Listar Veículos pela Marca");
			System.out.println("5 - Saír");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);

		} while (opcao != SAIR);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarContato(teclado);
			break;
		case 2:
			listarContatos();
			break;
		case 3:
			listarContato(teclado, "Nome");
			break;
		case 4:
			listarContato(teclado, "Telefone");
			break;
		case 5:
			System.out.println("Obrigado por usar nossos terminais.");
			break;
		default:
			System.out.println("Opção inválida");
		}

	}


	private void cadastrarContato(Scanner teclado) {
		System.out.println("========== CADASTRAR CONTATO ===========");
		System.out.println("Informe o nome do contato");
		String nome = teclado.nextLine();
		System.out.println("Informe o código do contato");
		String codigo = teclado.nextLine();
		System.out.println("Informe o email do contato");
		String email = teclado.nextLine();
		System.out.println("Informe o telefone do contato");
		String telefone = teclado.nextLine();
		boolean ok = controller.adicionar(nome, email, telefone, codigo);
		if(ok){
			System.out.println("Produto adicionado com sucesso");
		}else{
			System.out.println("Não foi possível adicionar o produto");
		}
	}

	private void listarContatos() {
		System.out.println("========== LISTA CONTATOS ===========");
		ArrayList<Contato> contatos = controller.listarContatos();
		for (Contato contato : contatos) {
			System.out.println(contato.toString());
		}
	}
	
	private void listarContato(Scanner teclado, String campo) {
		System.out.printf("Informe o %s do contato\n", campo);
		String filtro = teclado.nextLine();
		ArrayList<Contato> contatos = null;
		if(campo.toUpperCase() == "NOME") {
			contatos = controller.filtrarPorNome(filtro);
		}else {
			contatos = controller.filtrarPorTelefone(filtro);
		}
		System.out.println(contatos.toString());
	}

}
