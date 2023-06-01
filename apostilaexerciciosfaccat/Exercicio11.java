package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo 
		//por mês, mais  uma  comissão  também  fixa  para  cada  carro  vendido  e  mais  
		//5% do  valor  das  vendas  por  ele efetuadas. Escrever um algoritmo que leia
		//o número de  carros por  ele vendidos, o valor total de suas vendas, o salário fixo 
		//e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor. 
Scanner read = new Scanner (System.in);
		System.out.println("Olá! Por gentileza, escreva o total de carros vendidos pelo colaborador:");
		int nc = read.nextInt();
		System.out.println("Agora, escreva o valor total das vendas do colaborador:");
		double tv = read.nextDouble();
		System.out.println("Agora, escreva o valor do salário fixo do colaborador:");
		double sf = read.nextDouble();
		System.out.println("Qual o valor recebido por carro vendido?");
		double vpc = read.nextDouble();
		double ppv = tv*0.05;
		double cvc = nc*vpc;
		double nf = sf+ppv+cvc;
		System.out.println("O salário final do colaborador é de R$"+nf+".");
	}

}
