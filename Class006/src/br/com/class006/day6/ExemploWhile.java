package br.com.class006.day6;

public class ExemploWhile {

	public static void main(String[] args) {
		int number = 10;
		labelwhile: while (number <= 20) {
			System.out.println(number++);
			break labelwhile; //Usado para sair para o loop mais externo quando a mais de um loop dentro do outro
		}
	}

}
