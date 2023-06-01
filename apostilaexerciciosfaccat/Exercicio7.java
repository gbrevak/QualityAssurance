package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses
//e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar 
//ano com 365 dias e mês com 30 dias.
		Scanner read = new Scanner (System.in);
		System.out.println("Olá! Por gentileza, digite sua idade em anos:");
		int respanos=read.nextInt();
		System.out.println("Agora escreva os meses restantes:");
		int respmeses=read.nextInt();
		System.out.println("Agora escreva os dias restantes:");
		int respdias=read.nextInt();
		int anosemdias=respanos*365;
		int mesesemdias=respmeses*30;
		int diasemdias=anosemdias+mesesemdias+respdias;
		System.out.println("Você tem "+diasemdias+" dias de idade.");
	}

}
