package apostilaexerciciosfaccat;

import java.util.Scanner;
//Seja o seguinte algoritmo: 
//início 
//ler x ler y 
//z = (x*y) + 5 
//se z <= 0 então resposta = ‘A’ 
//senão se z <= 100 então resposta = ‘B’ 
//senão resposta = ‘C’         
//fim_se       
//fim_se escrever  z, resposta fim 

public class Exercicio34 {

	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			System.out.println("Por gentileza, digite o valor de x:");
			int x = read.nextInt();
			System.out.println("Por gentileza, digite o valor de y:");
			int y = read.nextInt();
			int z = x*y+5;
			if (z==0) {
				System.out.println("A resposta é A, e o número é "+z+".");
			} else if (z<=100) {
				System.out.println("A resposta é B, e o número é "+z+".");
			} else {
				System.out.println("A resposta é C, e o número é "+z+".");
			}
			read.close();
		} catch (Exception e) {
			System.out.println("Ei, por gentileza, reinicie o programa e digite valores válidos!");
		}

	}

}
