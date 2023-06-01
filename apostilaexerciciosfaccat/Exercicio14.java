package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		System.out.println("Por gentileza, digite um valor:");
		int ne = read.nextInt();
		if (ne>10) {
			System.out.println("Este número é maior que 10!");
		}
		if (ne<10) {
			System.out.println("Este número é menor que 10!");
		}
		if (ne==10) {
			System.out.println("Este número é igual a 10!");
		}
	}

}
