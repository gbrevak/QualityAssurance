package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		int hi = 0, hf = 0;
		Scanner read = new Scanner(System.in);
		while ((hi < 0) || (hi > 23)) {
			System.out.println("Digite o horário inicial da partida de Xadrez:");
			hi = read.nextInt();
		}
	
		while ((hf < 0) || (hf > 23)) {
			System.out.println("Digite o horário final da partida de Xadrez:");
			hf = read.nextInt();
		}
		int quanthorasjogo = hi - hf;
		if (quanthorasjogo < 0) {
			int finall = quanthorasjogo + 24;
			System.out.println("A quantidade de horas jogadas corresponde a: " + finall);
		} else if (quanthorasjogo == 0) {
			System.out.println("A quantidade de horas jogadas corresponde a: " + quanthorasjogo);
		} else {
			System.out.println("A quantidade de horas jogadas corresponde a: " + quanthorasjogo);
		}
	}}
