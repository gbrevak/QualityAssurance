package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			System.out.println("Olá, por gentileza digite a primeira nota:");
			double n1 = read.nextDouble();
			System.out.println("Olá, por gentileza digite a segunda nota:");
			double n2 = read.nextDouble();
			double m = (n1+n2)/2;
			if ((m<0)||(m>10)) {
				System.out.println("Por favor, digite um valor válido!");
			}		else if (m>=6) {
			System.out.println("O aluno foi aprovado.");
			System.out.println("A média do aluno é "+m+".");
			}else {
				System.out.println("O aluno foi reprovado.");
				System.out.println("A média do aluno é "+m+".");
			}
			
		} catch (Exception e) {
			System.out.println("Ei, por favor, digite um valor válido!");
		}

	}

}
