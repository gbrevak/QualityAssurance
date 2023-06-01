package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio19 {
	// Ler dois valores (considere que não serão lidos valores iguais) e escrever o
	// maior deles.
	public static void main(String[] args) {
		try {
			Scanner read = new Scanner(System.in);
			System.out.println("Digite o primeiro valor:");
			int v1 = read.nextInt();
			System.out.println("Digite o segundo valor:");
			int v2 = read.nextInt();
			if(v1==v2) {
				System.out.println("Ei, opção inválida!");
			} else if (v1>v2) {
				System.out.println(v1+" é o maior valor.");
			} else if (v2>v1) {
				System.out.println(v2+" é o maior valor.");
			}
			
		} catch (Exception e) {
			System.out.println("Por favor, digite um valor válido.");
		}

	}

}
