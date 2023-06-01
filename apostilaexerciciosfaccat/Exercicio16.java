package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		try {
			Scanner read = new Scanner(System.in);

			System.out.println("Olá! Escreva o número de maças compradas:");
			int n1 = read.nextInt();
			if (n1 < 0) {
				System.out.println("Por favor, digite um número válido!");
			} else if (n1 < 12) {
				double v = n1 * 1.30;
				System.out.println("O valor total da sua compra de maçãs é de R$" + v + ".");
			} else if (n1 >= 12) {
				double v = n1 * 1.0;
				System.out.println("O valor total da sua compra de maçãs é de R$" + v + ".");
			}

		} catch (Exception e) {
			System.out.println("Ei, por favor, digite um valor válido!");
		}
	}
}
