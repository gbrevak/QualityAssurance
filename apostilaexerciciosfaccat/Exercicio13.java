package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final 
		//deste aluno. Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. 
		//Fórmula para o cálculo da média.
		//final é: mediafinal(n1*2+n2*3+n3*5)/10
		Scanner read = new Scanner (System.in);
		System.out.println("Olá! Por gentileza, digite o valor da primeira nota:");
		int n1=read.nextInt();
		System.out.println("Agora, digite o valor da segunda nota:");
		int n2=read.nextInt();
		System.out.println("Ok,agora preciso do valor da terceira nota:");
		int n3=read.nextInt();
		int nf=(n1*2+n2*3+n3*5)/10;
		System.out.println("A nota final do aluno é "+nf+".");
	}

}
