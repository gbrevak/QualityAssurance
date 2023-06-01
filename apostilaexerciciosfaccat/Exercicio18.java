package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio18 {
	// 18) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma
	// mensagem que
	// diga se ela poderá ou não votar este ano (não é necessário considerar o mês
	// em que a
	// pessoa nasceu).

	public static void main(String[] args) {

		try {
			int anoatual, anonasc, conta;
			Scanner read = new Scanner(System.in);
			System.out.println("Olá, por favor, digite o ano atual:");
			anoatual = read.nextInt();
			System.out.println("Olá, por favor, digite seu ano de nascimento:");
			anonasc = read.nextInt();
			conta = anoatual - anonasc;
			if (conta >= 18) {
				System.out.println("Você pode votar esse ano!");
			} else {
				System.out.println("Você ainda não está apto para votar esse ano!");

			}
		} catch (Exception e) {
			System.out.println("Ei, por favor digite uma valor válido!");
		}
	}
}
