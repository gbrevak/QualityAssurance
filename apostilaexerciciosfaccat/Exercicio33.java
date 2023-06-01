package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio33 {
//Ler dois valores e imprimir uma das três mensagens a seguir: ‘Números iguais’, caso 
//os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; 
//‘Segundo maior’, caso o segundo seja maior que o primeiro.  
	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			System.out.println("Por gentileza, escreva o primeiro valor:");
			int v1 = read.nextInt();
			System.out.println("Por gentileza, escreva o segundo valor:");
			int v2 = read.nextInt();
			if (v1==v2) {
				System.out.println("Você digitou valores iguais.");
			} else if (v1>v2) {
				System.out.println("O primeiro valor é maior que o segundo");
			} else{
				System.out.println("O segundo valor é maior que o primeiro.");
			}
			read.close();
		} catch (Exception e) {
			System.out.println("Ei, por gentileza, reinicie o programa e digite valores válidos!");
		}

	}

}
