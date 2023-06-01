package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//Escreva um algoritmo para ler um
	//valor (do teclado) e escrever (na tela)
	// o seu antecessor.
		Scanner read= new Scanner(System.in);
		System.out.println("Olá! Por gentileza, digite um número:");
		int n1= read.nextInt();
		int resp=n1-1;
		System.out.println("O antecessor do número digitado é "+resp+".");
		
	}

}
