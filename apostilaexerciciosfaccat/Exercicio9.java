package apostilaexerciciosfaccat;

import java.util.Scanner;

class Exercicio9 {

	public static void main(String[] args) {
		//  Escreva um algoritmo para ler o salário mensal atual de um
//funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 
		Scanner read = new Scanner (System.in);
		System.out.println("Olá! Por gentileza escreva o valor do salário mensal atual:");
		float salario = read.nextFloat();
		System.out.println("Agora por gentileza, escreva a porcentagem de reajuste:");
		float reajuste = read.nextFloat();
		float valorr = (salario*reajuste)/100;
		float valorf = salario+valorr;
		System.out.println("O valor final após o reajuste é de R$"+valorf+".");
		
	}

}
