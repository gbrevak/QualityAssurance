package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio31 {
//Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever
//se formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve
//ser menor que a soma dos outros 2 lados.
	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			System.out.println("Por gentileza, digite o valor do lado A:");
			int a = read.nextInt();
			System.out.println("Por gentileza, digite o valor do lado B:");
			int b = read.nextInt();
			System.out.println("Por gentileza, digite o valor do lado C:");
			int c = read.nextInt();
			if ((a < b + c) && (b < a + c) && (c < a + b)) {
				System.out.println("Forma um triângulo.");
			} else {
				System.out.println("Não forma um triângulo.");
			}
			
		} catch (Exception e) {
			System.out.println("Ei, por gentileza digite um valor válido!");
		}
	}

}
