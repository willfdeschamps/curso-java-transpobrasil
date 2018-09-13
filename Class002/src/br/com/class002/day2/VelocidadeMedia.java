package br.com.class002.day2;

public class VelocidadeMedia {

	public static void main(String[] args) {
		short distancia = 200; //em KM
		short tempo = 240; //em minutos
		System.out.printf("Velocidade média em KM: %d", distancia / (tempo / 60));
	}
}
