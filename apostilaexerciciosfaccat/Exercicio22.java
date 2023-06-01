package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		try {
			Scanner read = new Scanner(System.in);
			System.out.println("Digite a quantidade de horas trabalhadas em um mês:");
			int quantht = read.nextInt();
			System.out.println("Digite o valor recebido por cada hora trabalhada:");
			float vh = read.nextFloat();
			if (quantht < 161) {
				float sf = quantht * vh;
				System.out.println("O valor a ser recebido é: R$" + sf);
			} else {
				float sf = (160 * vh) + (vh + vh+50 / 100);
				System.out.printf("O valor a ser recebido é: R$ %.2f",sf);
			}
			
		} catch (Exception e) {
			System.out.println("Ei, digite um valor válido!");
		}
	}

}
