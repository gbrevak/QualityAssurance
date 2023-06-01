package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		String nome = read.next();

		System.out.println("Digite o seu sexo:");
		char sexo = read.next().charAt(0);

		System.out.println("Digite sua altura:");
		double altura = read.nextDouble();

		if ((sexo == 'm')||(sexo == 'M')) {
			double pesoIdeal = 72.2*altura-58;
			System.out.printf("O peso ideal do(a) "+nome+" é de "+pesoIdeal+" kgs.");
			
		} else if ((sexo == 'f')||(sexo == 'F')) {
			double pesoIdeal = 72.2*altura-44.7;
			System.out.printf("O peso ideal do(a) "+nome+" é de "+pesoIdeal+" kgs.");
		}
		else {
			System.out.println("Ei, insira um sexo válido!");
		}

	}

}
