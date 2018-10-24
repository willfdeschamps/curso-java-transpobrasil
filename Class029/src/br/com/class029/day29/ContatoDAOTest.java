package br.com.class029.day29;

import java.util.List;

public class ContatoDAOTest {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.selectAll();
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
		
		contatos = dao.selectByName("Let");
		for (Contato contato : contatos) {
			System.out.println(contato);
		}
		
		
		

	}

}
