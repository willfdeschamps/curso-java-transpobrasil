package br.com.class010.day10;

import java.util.Arrays;
import java.util.Scanner;

public class Prova02JogoDaVelha {

	public static void main(String[] args) {
		char[][] OldWomanGame = {{'1','2','3'},
				                 {'4','5','6'},
				                 {'7','8','9'}};
		String line = "";
		char option = '0';
		int player = 0;
		char symbol = '1';
		Scanner keyboard = new Scanner(System.in);
		int i = 0;
		for (; i < 9; i++) {
			for (int j = 0; j < OldWomanGame.length; j++) {
				System.out.println(Arrays.toString(OldWomanGame[j]));
			}
			player = i%2+1;
			if(player == 1) {
				symbol = 'X';
			}else {
				symbol = 'O';
			}
			System.out.printf("Jogador %d informe uma posição:\n", player);
			line = keyboard.nextLine();
			if(line.length() > 1) {
				System.out.println("Informe um número entre 1 e 9!");
				i--;
				continue;
			} 
			option = line.charAt(0);
			
			switch (option) {
			case '1':
				if(OldWomanGame[0][0] != 'X' && OldWomanGame[0][0] != 'O') {
				  OldWomanGame[0][0] = symbol;		
				} else {
					System.out.printf("Posição %s já informada!\n", option);
					i--;
					continue;
				}
				break;
			case '2':
				if(OldWomanGame[0][1] != 'X' && OldWomanGame[0][1] != 'O') {
					  OldWomanGame[0][1] = symbol;		
					} else {
						System.out.printf("Posição %s já informada!\n", option);
						i--;
						continue;
					}		
				break;
			case '3':
				if(OldWomanGame[0][2] != 'X' && OldWomanGame[0][0] != '2') {
					  OldWomanGame[0][2] = symbol;		
					} else {
						System.out.printf("Posição %s já informada!\n", option);
						i--;
						continue;
					}		
				break;
			case '4':
				if(OldWomanGame[1][0] != 'X' && OldWomanGame[1][0] != 'O') {
					  OldWomanGame[1][0] = symbol;		
					} else {
						System.out.printf("Posição %s já informada!\n", option);
						i--;
						continue;
					}		
				break;	
			case '5':
				if(OldWomanGame[1][1] != 'X' && OldWomanGame[1][1] != 'O') {
					  OldWomanGame[1][1] = symbol;		
					} else {
						System.out.printf("Posição %s já informada!\n", option);
						i--;
						continue;
					}		 
				break;
			case '6':
				if(OldWomanGame[1][2] != 'X' && OldWomanGame[1][2] != 'O') {
					  OldWomanGame[1][2] = symbol;		
					} else {
						System.out.printf("Posição %s já informada!\n", option);
						i--;
						continue;
					}		
				break;
			case '7':
				if(OldWomanGame[2][0] != 'X' && OldWomanGame[2][0] != 'O') {
					  OldWomanGame[2][0] = symbol;		
					} else {
						System.out.printf("Posição %s já informada!\n", option);
						i--;
						continue;
					}
				break;
			case '8':
				if(OldWomanGame[2][1] != 'X' && OldWomanGame[2][1] != 'O') {
					  OldWomanGame[2][1] = symbol;		
					} else {
						System.out.printf("Posição %s já informada!\n", option);
						i--;
						continue;
					}
				break;
			case '9':
				if(OldWomanGame[2][2] != 'X' && OldWomanGame[2][2] != 'O') {
					  OldWomanGame[2][2] = symbol;		
					} else {
						System.out.printf("Posição %s já informada!\n", option);
						i--;
						continue;
					}
				break;
			default:
				System.out.println("Informe um número entre 1 e 9!");
				i--;
				continue;
			}
			if((OldWomanGame[0][0] == OldWomanGame[1][1] && OldWomanGame[0][0] == OldWomanGame[2][2]) ||
			   (OldWomanGame[0][2] == OldWomanGame[1][1] && OldWomanGame[1][1] == OldWomanGame[2][0]) ||
			   (OldWomanGame[0][0] == OldWomanGame[0][1] && OldWomanGame[0][0] == OldWomanGame[0][2]) ||
			   (OldWomanGame[1][0] == OldWomanGame[1][1] && OldWomanGame[1][0] == OldWomanGame[1][2]) ||
			   (OldWomanGame[2][0] == OldWomanGame[2][1] && OldWomanGame[2][0] == OldWomanGame[2][2]) ||
			   (OldWomanGame[0][0] == OldWomanGame[1][0] && OldWomanGame[0][0] == OldWomanGame[2][0]) ||
			   (OldWomanGame[0][1] == OldWomanGame[1][1] && OldWomanGame[0][1] == OldWomanGame[2][1]) ||
			   (OldWomanGame[0][2] == OldWomanGame[1][2] && OldWomanGame[0][2] == OldWomanGame[2][2])) 
			  {
				System.out.printf("Player %d venceu o jogo!\n",player );
				for (int j = 0; j < OldWomanGame.length; j++) {
					System.out.println(Arrays.toString(OldWomanGame[j]));
				}
				break;
			}
		}
		if(i == 9) {
			System.out.println("O jogo terminou empatado!");
		}
		keyboard.close();

	}

}
