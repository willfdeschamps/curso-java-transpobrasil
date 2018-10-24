package br.com.class021.day21;

public class ExemploExcecaoChecada {

	public static void main(String[] args) throws Exception {
		usaImprimirRange();
	}
	
	private static boolean usaImprimirRange() throws RangeInvalidException{
		int inicio = 1;
		int fim = 10;
		boolean ok = true;
		try {
			imprimirRange(inicio, fim);
			//System.exit(0);
			return ok;
		} catch (RangeInvalidException e) {
			System.out.println(e.getMessage());
			ok = false;
			return ok;
		} finally {
			System.out.println("Finally executado");
		}
	}
	
	private static void imprimirRange(int inicio, int fim) throws RangeInvalidException{
		if(fim <= inicio) {
			throw new RangeInvalidException("O fim deve ser maior que ínicio");
		} else {
			for(int i = inicio; i <=fim; i++) {
				System.out.printf("%d ", i);
			}
			System.out.println("");
		}
	}

}
