package apostilaManzano;

import java.util.Scanner;

public class Exerc5111f {
//Elaborar  um  programa  que  apresente  como  resultado  o  valor  de  uma  potência
//de  uma  base qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o 
//valor da base e E o valor do expoente. Observe que neste exercício não pode ser utilizado
//o operador de exponenciação do portuguol (^). 
	public static void main(String[] args) {
		try {
			Scanner r = new Scanner (System.in);
			System.out.println("Digite o valor da base: ");
	        int b = r.nextInt();

	        System.out.println("Digite o valor do expoente: ");
	        int e = r.nextInt();

	        int resultado = 1;
	        for (int i = 0; i < e; i++) {
	            resultado = resultado * b;
	        }

	        System.out.println("O resultado da potência é: " + resultado+".");

		} catch (Exception e) {
			System.out.println("Por gentileza, reinicie o programa e digite um valor válido!");
		}

	}

}
