package br.com.class023.day023;

import java.util.HashSet;
import java.util.Set;

public class UsoProduto {

	public static void main(String[] args) {
		Produto p = new Produto(null, "Produto 01", 1.99, Categoria.VESTUARIO);
		System.out.printf("Categoria = %s \n", p.getCategoria());
		
		p.hashCode();
		
		Set<Produto> produtos = new HashSet() {
			@Override
			public boolean equals(Object o) {
				return super.equals(o);
			}
		};
		produtos.add(p);
		
		System.out.println(produtos.contains(new Produto(1, "Produto 01", 1.99, Categoria.VESTUARIO)));
		System.out.println(produtos.contains(p));
		System.out.println(produtos.size());
		produtos.remove(new Produto(1, "Produto 01", 1.99, Categoria.VESTUARIO));
		System.out.println(produtos.size());
	}

}
