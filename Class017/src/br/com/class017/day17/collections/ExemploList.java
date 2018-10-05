package br.com.class017.day17.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Jo�o");
		nomes.add("Maria");
		nomes.add("Ad�o");
		nomes.add("Eva");
		nomes.add("Ana");
		
		System.out.println(nomes);
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
	
		Collections.sort(nomes, Collections.reverseOrder());
		
		System.out.println(nomes);
		
		List<Contato> contatos = new ArrayList<>();
		
		contatos.add(new Contato("Jo�o", "asdasd"));
		contatos.add(new Contato("Maria", "asdasd"));
		contatos.add(new Contato("Ad�o", "asdasd"));
		contatos.add(new Contato("Eva", "asdasd"));
		contatos.add(new Contato("Ana", "asdasd"));
		contatos.add(new Contato("Ana", "bsdasd"));
		
		
		System.out.println(contatos);
		
		Collections.sort(contatos);
		System.out.println(contatos);
		Collections.sort(contatos, Collections.reverseOrder());

		System.out.println(contatos);
		
	}
	
}
