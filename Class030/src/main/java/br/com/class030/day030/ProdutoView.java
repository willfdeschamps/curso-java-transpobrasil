package br.com.class030.day030;

import java.util.List;
import java.util.Scanner;

public class ProdutoView {
	private static final int CADASTRAR_PRODUTO = 1;
	private static final int LISTAR_PRODUTOS = 2;
	private static final int LISTAR_PRODUTOS_POR_FAIXA = 3;
	private static final int LISTAR_PRODUTOS_POR_NOME = 4;
	private static final int EDITAR_PRODUTO = 5;
	private static final int REMOVER_PRODUTO = 6;
	private static final int SAIR = 0;

	ProdutoController controller = new ProdutoController();

	public void carregaMenu(Scanner teclado) {
		int opcao = 0;
		do {
			opcao = leInt(
					"1 - Cadastrar Produto\n"+
					"2 - Listar produtos\n" +
					"3 - Listar produtos por faixa de preço\n"+
					"4 - Listar produtos por nome\n"+
					"5 - Editar produto\n"+
					"6 - Remover produto\n"+
					"0 - Sair\n", teclado);

			tratarOpcao(opcao, teclado);
		} while (opcao != 0);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case CADASTRAR_PRODUTO:
			cadastrarProduto(teclado);
			break;
		case LISTAR_PRODUTOS:
			listarProdutos();
			break;
		case LISTAR_PRODUTOS_POR_FAIXA:
			listarProdutosPorFaixa(teclado);
			break;
		case LISTAR_PRODUTOS_POR_NOME:
			listarProdutorPorNome(teclado);
			break;
		case EDITAR_PRODUTO:
			editarProduto(teclado);
			break;
		case REMOVER_PRODUTO:
			removerProduto(teclado);
			break;
		case SAIR:
			System.out.println("Obrigado por usar o nosso cadastro de produtos!");
			break;

		default:
			System.out.printf("Opção %d inválida!\n", opcao);
			break;
		}
	}

	private void cadastrarProduto(Scanner teclado) {
		System.out.println("-----------Cadastro de Produto------------");
		String nome = leString("Informe o nome do produto:", teclado);
		double preco = leDouble("Informe o preço do produto:", teclado);
		int resultadoOperacao = controller.adicionar(nome, preco);
		imprimirResultadoOperacao(resultadoOperacao);
	}

	private void listarProdutos() {
		System.out.println("------------Listar de Produtos------------");
		imprimirProdutos(controller.buscarTodos());
	}

	private void listarProdutosPorFaixa(Scanner teclado) {
		System.out.println("------------Listar de Produtos por faixa de preço ------------");
		double precoMinimo = leDouble("Informe o preço mínimo:", teclado);
		double precoMaximo = leDouble("Informe o preço Máximo:", teclado);
		imprimirProdutos(controller.filtrarPorPreco(precoMinimo, precoMaximo));
	}


	private void listarProdutorPorNome(Scanner teclado) {
		System.out.println("------------Listar de Produtos pelo nome ------------");
		String nome = leString("Informe uma parte do nome:", teclado);
		imprimirProdutos(controller.filtrarPorNome(nome));
	}

	private void editarProduto(Scanner teclado) {
		System.out.println("-----------Edição de Produto------------");
		System.out.println();
		int id = leInt("Informe o id do produto:", teclado);
		String nome = leString("Informe o nome do produto:", teclado);
		double preco = leDouble("Informe o preço do produto:", teclado);
		int resultadoOperacao = controller.editar(id, nome, preco);
		imprimirResultadoOperacao(resultadoOperacao);
	}

	private void removerProduto(Scanner teclado) {
		System.out.println("-----------Remoção de Produto------------");
		Integer id = leInt("Informe o id do produto:", teclado);
		int resultadoOperacao = controller.remover(id);
		imprimirResultadoOperacao(resultadoOperacao);
	}

	private double leDouble(String mensagem, Scanner teclado) {
		Double resultado = null;
		do {
			System.out.println(mensagem);
			resultado = tratarDouble(teclado.nextLine());
		} while (resultado == null);

		return resultado;
	}

	public Double tratarDouble(String valor) {
		Double resultado = null;
		try {
			resultado = Double.parseDouble(valor);
		} catch (NumberFormatException e) {
			System.out.println("Deve ser informado um valor monetário!");
		} catch (NullPointerException e) {
			System.out.println("Não pode ser informado um valor nulo!");
		}
		return resultado;
	}
	
	private int leInt(String mensagem, Scanner teclado) {
		Integer resultado = null;
		do {
			System.out.println(mensagem);
			resultado = tratarInt(teclado.nextLine());
		} while (resultado == null);

		return resultado;
	}

	public Integer tratarInt(String valor) {
		Integer resultado = null;
		try {
			resultado = Integer.parseInt(valor);
		} catch (NumberFormatException e) {
			System.out.println("Deve ser informado um valor inteiro!");
		} 
		return resultado;
	}	

	private String leString(String mensagem, Scanner teclado) {
		String resultado = null;
		do {
			System.out.println(mensagem);
			resultado = tratarString(teclado.nextLine());
		} while (resultado == null);

		return resultado;
	}

	public String tratarString(String valor) {
		String resultado = null;
		if(valor.trim().equals("")) {
			System.out.println("O texto informado não pode ser branco!");
		} else {
			resultado = valor;
		}
		return resultado;
	}	
	private void imprimirResultadoOperacao(int resultadoOperacao) {
		if (resultadoOperacao == ProdutoController.OPERACAO_SUCESSO) {
			System.out.println("Operação realizada com sucesso!");
		} else if (resultadoOperacao == ProdutoController.OPERACAO_FRACASSO) {
			System.out.println("Não foi possível realizar a operação!");
		} else {
			System.out.println("O Id informado não existe no banco de dados!\n");
		}

	}

	private void imprimirProdutos(List<Produto> produtos) {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
