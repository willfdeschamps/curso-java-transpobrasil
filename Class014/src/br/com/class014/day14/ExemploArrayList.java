package br.com.class014.day14;

import java.util.ArrayList;

public class ExemploArrayList {

	public static void main(String[] args) {
		//definir uma lista de nomes
		ArrayList<String> listaNomes = new ArrayList<>();
		
		//Quantos elementos tem na lista
		System.out.println(listaNomes.size());
		
		//Adcionar elementos
		listaNomes.add("Jo�o"); //Adiciona no final da lista
		listaNomes.add("Maria"); //Adiciona no final da lista
		
		listaNomes.add(0, "Ad�o"); //Adiciona na posi��o 0
		listaNomes.add(1, "Eva"); //Adiciona na posi��o 1
		
		listaNomes.set(1, "Eva Maria da Silva"); //Sobrescreve � posi��o 1
		
		System.out.println(listaNomes.get(2)); //Busca um elemento da lista na posicao 2
		System.out.println(listaNomes.get(3)); //Busca um elemento da lista na posicao 3
		
		String removido = listaNomes.remove(0); //Remove elemento na posi��o 0 e retorna o objeto
		boolean removeu = listaNomes.remove(removido);
		
		if(!removeu) {
			System.out.println("Este item j� foi removido!");
		}
	}

}
