package br.com.class016.day16;

public class App {

	public static void main(String[] args) {
	Funcionario func = new Funcionario("FUNC-0001", "João da Silva",  1000);
	Vendedor vend = new Vendedor("VEND-0001", "Mohammed Salah", 1000, 0.05, 100000);
	Funcionario fv = new Vendedor("VEND-0002", "Lionel Messi", 1200, 0.10, 20000);
	
	FolhaPagamento folha = new FolhaPagamento();
	folha.imprimirFolha(func);
	folha.imprimirFolha(vend);
	folha.imprimirFolha(fv);
	}

}
