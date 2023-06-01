package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio32 {
// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE. 
	public static void main(String[] args) {
		try {
			Scanner read = new Scanner(System.in);
			System.out.println("Por gentileza, escreva o nome do primeiro time:");
			String time1 = read.next();
			System.out.println("Agora escreva quantos gols o primeiro time marcou:");
			int golstime1 = read.nextInt();
			System.out.println("Por gentileza, escreva o nome do segundo time:");
			String time2 = read.next();
			System.out.println("Agora escreva quantos gols o segundo time marcou:");
			int golstime2 = read.nextInt();
			if (golstime1 > golstime2) {
				System.out.println("O time " + time1 + " ganhou!");
			} else if (golstime2 > golstime1) {
				System.out.println("O time " + time2 + " ganhou!");
			} else {
				System.out.println("Empate!");
			}
		} catch (Exception e) {
			System.out.println("Ei, por gentileza, escreva um valor válido!"+e);
		}

	}

}
