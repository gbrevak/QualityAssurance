package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio37 {
//Uma fruteira está vendendo frutas com a seguinte tabela de preços: 
//Até 5 Kg Acima de 5 Kg Morango R$ 2,50 por Kg R$ 2,20 por Kg Maçã R$ 1,80 por Kg R$ 1,50 por Kg 
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
//receberá ainda  um  desconto  de  10%  sobre  este  total.  Escreva  um  algoritmo  para  ler  
//a  quantidade  (em  Kg)  de morangos e a quantidade (em Kg) de maças adquiridas e escreva o 
//valor a ser pago pelo cliente. 
	public static void main(String[] args) {
		try {
			double precomorangos, precomacas;
			Scanner read = new Scanner (System.in);
			System.out.println("Por gentileza, escreva em kgs a quantidade de morangos:");
			double quantkgmorangos = read.nextDouble();
			System.out.println("Por gentileza, escreva em kgs a quantidade de maçãs:");
			double quantkgmacas = read.nextDouble();
			if (quantkgmorangos<5) {
				precomorangos = quantkgmorangos*2.50;
			} else {
				precomorangos = quantkgmorangos*2.20;
			} if (quantkgmacas<5) {
				precomacas= quantkgmacas*1.80;
			} else {
				precomacas= quantkgmacas*1.50;
			}
			double valortotal= precomorangos+precomacas;
			if (quantkgmorangos+quantkgmacas>8 || valortotal>25) {
				double desconto = valortotal * 0.10;
				valortotal=valortotal-desconto;
				
			}
			System.out.println("Valor a ser pago é igual a R$"+valortotal+" reais.");
		} catch (Exception e) {
		System.out.println("Ei, por gentileza, reinicie o programa e digite um valor válido!");
		}

	}

}
