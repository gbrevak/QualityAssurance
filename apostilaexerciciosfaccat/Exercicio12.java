package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Escreva  um  algoritmo  para  ler  uma  temperatura  
		//em  graus  Fahrenheit,  calcular  e  escrever  o  valor 
		//correspondente em graus Celsius (baseado na fórmula abaixo):
		//c/5=(f-32)/9
		Scanner read = new Scanner (System.in);
		System.out.println("Olá! Por gentileza, escreva a temperatura em graus Fahrenheit: (por favor, digite apenas números!)");
		double tf = read.nextDouble();
		double tc = ((tf-32)/9)*5;
		System.out.println("A temperatura de graus Celsius é de "+tc+".");
	}

}
