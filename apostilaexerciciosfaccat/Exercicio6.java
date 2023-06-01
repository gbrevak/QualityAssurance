package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler as dimensões de um retângulo
		//(base e altura), calcular e escrever a área do retângulo.
		try {
		Scanner read = new Scanner (System.in);
		System.out.println("Olá! Por gentileza, digite o valor da base do retângulo:");
		int base = read.nextInt();
		System.out.println("Agora, por gentileza, digite o valor da altura do retângulo:");
		int alt = read.nextInt();
		int area = alt*base;
		System.out.println("A área do retângulo é igual a "+area+".");
		}
		catch (Exception e) {
			System.out.println("Ei! Você digitou um valor inválido!");
		}
	}

}
