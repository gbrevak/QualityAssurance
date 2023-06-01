package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio30 {
//  Ler  3  valores (considere  que  não  serão  informados  valores  iguais)  
//	e  escrevê-los  em  ordem crescente. 
	public static void main(String[] args) {

		try {
			Scanner read = new Scanner(System.in);
			System.out.println("Por gentileza, digite o primeiro valor:");
			int v1 = read.nextInt();
			System.out.println("Por gentileza, digite o segundo valor:");
			int v2 = read.nextInt();
			System.out.println("Por gentileza, digite o terceiro valor:");
			int v3 = read.nextInt();
			if ((v1 == v2) || (v1 == v3) || (v2 == v3)) {
				System.out.println("Ei, você não pode digitar o valor mais de uma vez.");
			} else if ((v1 > v2) && (v1 > v3) && (v2 > v3)) {
				System.out.println(v3 + ", " + v2 + ", " + v1);
			}else if ((v1 > v2) && (v1 > v3) && (v3 > v2)) {
				System.out.println(v2 + ", " + v3 + ", " + v1);
			}else if ((v2 > v1) && (v2 > v3) && (v1 > v3)) {
				System.out.println(v3 + ", " + v1 + ", " + v2);
			}else if ((v2 > v1) && (v2 > v3) && (v3 > v1)) {
				System.out.println(v1 + ", " + v3 + ", " + v2);
			}else if ((v3 > v1) && (v3 > v2) && (v1 > v2)) {
				System.out.println(v2 + ", " + v1 + ", " + v3);
			}else if ((v3 > v1) && (v3 > v2) && (v2 > v1)) {
				System.out.println(v1 + ", " + v2 + ", " + v3);
			}
			

		} catch (Exception e) {
			System.out.println("Ei, por gentileza, digite um valor válido!");
		}
	}

}
