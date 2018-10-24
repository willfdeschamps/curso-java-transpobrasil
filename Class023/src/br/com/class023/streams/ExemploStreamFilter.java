package br.com.class023.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.class023.day023.Categoria;
import br.com.class023.day023.Produto;

public class ExemploStreamFilter {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(1, "Produto 01", 10.0, Categoria.ALIMENTO));
		produtos.add(new Produto(2, "Produto 02", 100.0, Categoria.ELETRONICO));
		produtos.add(new Produto(3, "Produto 03", 9.0, Categoria.LIMPEZA));
		produtos.add(new Produto(4, "Produto 04", 47.90, Categoria.PERFUMARIA));
		produtos.add(new Produto(5, "Produto 05", 29.51, Categoria.VESTUARIO));
		produtos.add(new Produto(6, "Produto 06", 19.90, Categoria.ALIMENTO));
		produtos.add(new Produto(7, "Produto 07", 10.0, Categoria.ELETRONICO));
		produtos.add(new Produto(8, "Produto 08", 10.0, Categoria.LIMPEZA));
		produtos.add(new Produto(9, "Produto 09", 1.0, Categoria.PERFUMARIA));
		produtos.add(new Produto(10, "Produto 10", 89.90, Categoria.VESTUARIO));

		Stream<Produto> streamProdutos = produtos.stream(); // DataSet
		System.out.println("Alimentos");
		streamProdutos.filter((Produto produto) -> {
			return Categoria.ALIMENTO.equals(produto.getCategoria());
		}).map(p -> p.getNome()).forEach(System.out::println); // Reduce

		List<Produto> alimentos = produtos.stream().filter((Produto produto) -> {
			return Categoria.ALIMENTO.equals(produto.getCategoria());
		}).collect(Collectors.toList());

		for (Produto alimento : alimentos) {
			System.out.println(alimento.getNome());
		}
		// System.out.println(streamProdutos.count());
		// streamAlimentos.forEach(System.out::println);

		System.out.println("Perfumes");
		produtos.stream().filter((Produto produto) -> {
			return Categoria.PERFUMARIA.equals(produto.getCategoria());
		}).map(p -> p.getNome()).forEach(System.out::println);

		List<Produto> perfumes = produtos.stream().filter((Produto produto) -> {
			return Categoria.PERFUMARIA.equals(produto.getCategoria());
		}).collect(Collectors.toList());

		for (Produto perfumeAtual : perfumes) {
			System.out.println(perfumeAtual.getNome());
		}

		System.out.println("Produtos com preço inferiorees há 50.0");
		produtos.stream().filter((Produto produto) -> {
			return produto.getPreco() <= 50.0;
		}).map(p -> p.getNome()).forEach(System.out::println);

		List<String> nomesProdutosMaiorQue50 = produtos.stream().filter(p -> p.getPreco() > 50.0).map(p -> p.getNome())
				.collect(Collectors.toList());

		for (String nomeAtual : nomesProdutosMaiorQue50) {
			System.out.println(nomeAtual);
		}

		double total = produtos.stream().mapToDouble(p -> p.getPreco()).sum();
		System.out.printf("O alor total dos produtos é %.2f\n", total);
		OptionalDouble media = produtos.stream().mapToDouble(p -> p.getPreco()).average();
		System.out.printf("A média de preços é %.2f\n", media.getAsDouble());
		Map<Categoria, Double> map = new HashMap<>();

		Map<Categoria, Double> totalizador = produtos
				.stream().
				filter(p -> p.getPreco() < 50.0)
				.reduce(map,
				(current, prod) -> {
					Double value = current.get(prod.getCategoria());
					if (value == null) {
						value = 0.0;
					}
					value += prod.getPreco();
					current.put(prod.getCategoria(), value);

					return current;
				}, (i, j) -> {
					return i;
				});

		for (Map.Entry<Categoria, Double> item : totalizador.entrySet()) {
			System.out.printf("%s = %.2f\n", item.getKey(), item.getValue());
		}
		// produtos.stream().reduce(map -> new HashMap<String, Double>(), (a, b)
		// -> { map.put(b.getCategoria(), b.getPreco());}, null );
		//Menos preco
		Optional<Produto> produtoMenor = produtos
		.stream()
		.reduce((anterior, atual) -> {
			return anterior.getPreco() < atual.getPreco() ? anterior : atual;
		});
		
		System.out.println("O produto de menor preço é: " + produtoMenor.get().getNome());
	}

}
