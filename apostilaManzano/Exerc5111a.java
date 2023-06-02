package apostilaManzano;

import java.util.Scanner;
//Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer. 
public class Exerc5111a {

	public static void main(String[] args) {
		try {

			Scanner r = new Scanner (System.in);
			System.out.println("Por gentileza, digite um valor:");
			int n1=r.nextInt();
			for(int cont = 0;cont<11; cont++) {
				System.out.println(cont + "X" + n1 + "="+n1*cont);
			}
			} catch (Exception e) {
			System.out.println("Por gentileza, reinicie o programa e digite um valor válido!");
		}
		
			
		

	}
}

