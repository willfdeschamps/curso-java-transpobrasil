package br.com.class014.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class VeiculoView {


	private static final int SAIR = 8;
	VeiculoController controller = new VeiculoController();

	public void mostrarMenu(Scanner teclado) {
		controller.adicionar("Volkswagen", "Gol", "ABC1234", 2001, 2002, "Vermelho");
		controller.adicionar("Peugeot", "307", "XYZ", 2009, 2010, "Branco");
		int opcao = 0;
		do {
			System.out.println("========== MENU PRINCIPAL ===========");
			System.out.println("1 - Cadastrar Ve�culo");
			System.out.println("2 - Listar ve�culos");
			System.out.println("3 - Listar ve�culos pela Marca");
			System.out.println("4 - Listar ve�culos pelo Modelo");
			System.out.println("5 - Listar ve�culos pela Placa");
			System.out.println("6 - Listar ve�culos pelo Ano de Fabrica��o");
			System.out.println("7 - Remover ve�culo");
			System.out.println("8 - Sa�r");
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
			listarVeiculo(teclado, "MARCA");
			break;
		case 4:
			listarVeiculo(teclado, "MODELO");
			break;
		case 5:
			listarVeiculo(teclado, "PLACA");
			break;
		case 6:
			listarVeiculo(teclado, "ANOFABRICACAO");
			break;
		case 7:
			removerVeiculo(teclado);
			break;
		default:
			System.out.println("Op��o inv�lida");
		}

	}


	private void removerVeiculo(Scanner teclado) {
		System.out.println("========== REMOVER VE�CULO ===========");
		System.out.println("Informe o ID do ve�culo");
		int index = Integer.parseInt(teclado.nextLine());
		if(controller.remover(index)) {
			System.out.println("Ve�culo removido com sucesso!");
		}else {
			System.out.println("Ve�culo n�o encontrado!");
		}
	}

	private void cadastrarContato(Scanner teclado) {
		System.out.println("========== CADASTRAR VE�CULO ===========");
		System.out.println("Informe a marca do ve�culo");
		String marca = teclado.nextLine();
		System.out.println("Informe o modelo do ve�culo");
		String modelo = teclado.nextLine();
		System.out.println("Informe a placa do ve�culo");
		String placa = teclado.nextLine();
		System.out.println("Informe o ano de fabrica��o do ve�culo");
		int anoFabricacao = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe o ano do Modelo do ve�culo");
		int anoModelo = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe a cor do ve�culo");
		String cor = teclado.nextLine();
		boolean ok = controller.adicionar(marca, modelo, placa, anoFabricacao, anoModelo, cor);
		if(ok){
			System.out.println("Produto adicionado com sucesso!");
		}else{
			System.out.println("N�o foi poss�vel adicionar o produto!");
		}
	}

	private void listarContatos() {
		System.out.println("========== LISTA CONTATOS ===========");
		ArrayList<Veiculo> veiculos = controller.listarContatos();
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.toString());
		}
	}
	
	private void listarVeiculo(Scanner teclado, String campo) {
		System.out.printf("Informe o %s do contato\n", campo);
		String filtro = teclado.nextLine();
		ArrayList<Veiculo> veiculos = null;
		if(campo.toUpperCase() == "MARCA") {
			veiculos = controller.filtrarPorMarca(filtro);
		}else if (campo.toUpperCase() == "MODELO") {
			veiculos = controller.filtrarPorModelo(filtro);
		}else if (campo.toUpperCase() == "PLACA") {
			veiculos = controller.filtrarPorPlaca(filtro);
		}else if (campo.toUpperCase() == "ANOFABRICACAO") {
			veiculos = controller.filtraPorAnoFabricacao(Integer.parseInt(filtro));
		}
		
		System.out.println(veiculos.toString());
	}

}
