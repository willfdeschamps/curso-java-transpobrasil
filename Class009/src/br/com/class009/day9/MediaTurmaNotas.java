package br.com.class009.day9;

import java.util.Arrays;
import java.util.Scanner;

public class MediaTurmaNotas {

	public static void main(String[] args) {
		double[][] notas = new double[10][3];
		double[] mediaNotasAluno = new double[notas.length];
		double mediaTurma = 0;
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Aluno " + i);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("Digite a nota %d do aluno %d\n", j+1, i+1);
				notas[i][j] = Double.parseDouble(keyboard.nextLine());
				mediaNotasAluno[i] += notas[i][j]; 
			}
			mediaNotasAluno[i] /= notas[i].length;
			mediaTurma += mediaNotasAluno[i];
		}
		mediaTurma /= mediaNotasAluno.length;
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Notas Aluno %d: %s\n",  i , Arrays.toString(notas[i]));
			System.out.printf("Média Aluno %d: %.2f\n",  i , mediaNotasAluno[i]);
		}
		System.out.printf("Média da turma: %.2f", mediaTurma);
		keyboard.close();
	}

}
