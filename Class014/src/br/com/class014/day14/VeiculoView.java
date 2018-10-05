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
			System.out.println("1 - Cadastrar Veículo");
			System.out.println("2 - Listar veículos");
			System.out.println("3 - Listar veículos pela Marca");
			System.out.println("4 - Listar veículos pelo Modelo");
			System.out.println("5 - Listar veículos pela Placa");
			System.out.println("6 - Listar veículos pelo Ano de Fabricação");
			System.out.println("7 - Remover veículo");
			System.out.println("8 - Saír");
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
			System.out.println("Opção inválida");
		}

	}


	private void removerVeiculo(Scanner teclado) {
		System.out.println("========== REMOVER VEÍCULO ===========");
		System.out.println("Informe o ID do veículo");
		int index = Integer.parseInt(teclado.nextLine());
		if(controller.remover(index)) {
			System.out.println("Veículo removido com sucesso!");
		}else {
			System.out.println("Veículo não encontrado!");
		}
	}

	private void cadastrarContato(Scanner teclado) {
		System.out.println("========== CADASTRAR VEÍCULO ===========");
		System.out.println("Informe a marca do veículo");
		String marca = teclado.nextLine();
		System.out.println("Informe o modelo do veículo");
		String modelo = teclado.nextLine();
		System.out.println("Informe a placa do veículo");
		String placa = teclado.nextLine();
		System.out.println("Informe o ano de fabricação do veículo");
		int anoFabricacao = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe o ano do Modelo do veículo");
		int anoModelo = Integer.parseInt(teclado.nextLine());
		System.out.println("Informe a cor do veículo");
		String cor = teclado.nextLine();
		boolean ok = controller.adicionar(marca, modelo, placa, anoFabricacao, anoModelo, cor);
		if(ok){
			System.out.println("Produto adicionado com sucesso!");
		}else{
			System.out.println("Não foi possível adicionar o produto!");
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
