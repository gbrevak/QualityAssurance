package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio27 {
//Ler um valor e escrever se é positivo, negativo ou zero.
	public static void main(String[] args) {
try {
	Scanner read = new Scanner (System.in);
	System.out.println("Por gentileza, digite um número inteiro:");
	int n1 = read.nextInt();
	if (n1==0) {
		System.out.println("Ei, você digitou 0!");
		
	} else if (n1>0) {
		System.out.println("Esse número é positivo.");
	} else {
		System.out.println("Esse número é negativo.");
	}
	
} catch (Exception e) {
	System.out.println("Ei, por gentileza reinicie o programa e digite um valor válido!");
}

	}

}
