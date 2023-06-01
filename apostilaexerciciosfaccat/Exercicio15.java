package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		try {
			// Ler um valor e escrever se é positivo
			//ou negativo (considere o valor zero como positivo).
			Scanner read = new Scanner(System.in);
			System.out.println("Olá, por gentileza, escreva um valor:");
			int n1 = read.nextInt();
			if (n1>=0) {
				System.out.println("Esse valor é positivo!");
			}
			if (n1<0) {
				System.out.println("Esse valor é negativo!");
			}
		} catch (Exception e) {
			System.out.println("Ei, digite um valor válido!");
		}
		
		
	}

}
