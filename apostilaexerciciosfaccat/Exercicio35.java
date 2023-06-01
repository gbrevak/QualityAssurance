package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio35 {
//Um posto está vendendo combustíveis com a seguinte tabela de descontos: 
//até 20 litros, desconto de 3% por litro Álcool acima de 20 litros,
//desconto de % por litro até 20 litros, desconto de 4% por litro Gasolina acima de 20 litros,
//desconto de 6% por litro Escreva  um  algoritmo  que  leia  o  número  de  litros  vendidos 
//e  o  tipo  de  combustível (codificado  da seguinte  forma: A-álcool, G-gasolina),  calcule  
//e  imprima  o  valor  a  ser  pago  pelo  cliente  sabendo-se que o preço do litro da gasolina
//é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			double precogasosa=3.30, precoalcool= 2.90;
			
			System.out.println("Por gentileza, escreva quantos litros de combustível foram utilizados:");
			double quantcombust = read.nextDouble();
			System.out.println("Agora digite A se o combustível utilizado foi álcool, e G se foi gasolina.");
			char tipocomb = read.next().charAt(0);
			if ((tipocomb=='a')|| (tipocomb=='A')) {	
				if (quantcombust<=20) {
					double valortotal = quantcombust * precoalcool * 0.97;
					System.out.println("O valor total a ser pago é de R$ "+valortotal+".");
				} else {
					double valortotal = quantcombust * precoalcool * 0.95;
					System.out.println("O valor total a ser pago é de R$ "+valortotal+".");
					}
			} else if((tipocomb=='g')|| (tipocomb=='G')) {
				if(quantcombust<=20) {
					double valortotal = quantcombust * precogasosa * 0.96;
					System.out.println("O valor total a ser pago é de R$ "+valortotal+".");
				} else {
					double valortotal = quantcombust * precogasosa * 0.94;
					System.out.println("O valor total a ser pago é de R$ "+valortotal+".");
				}
				
			} else {
				System.out.println("Tipo de combustível inválido.");
			}
				
			
		} catch (Exception e) {
			System.out.println("Ei, por gentileza, reinicie o programa e digite valores válidos!");
		}

	}

}
