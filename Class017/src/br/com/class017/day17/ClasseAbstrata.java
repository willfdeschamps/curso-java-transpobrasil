package br.com.class017.day17;

public interface ClasseAbstrata {
	public int valor = 0;
	public void fazIsso();
	public int retornaAquilo();
	public default void fazAquiMesmo() {
		//valor = 10; isso não funciona
	}
	public default int getValor() {
		return valor;
	}
}
