package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio25 {
// Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
//escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual 
//for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. 
	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			double conta, saldo=0, saldoAtual, debito=0, credito=0;
			
			System.out.println("Digite o número da conta:");
			conta=read.nextDouble();
			System.out.println("Digite o saldo da conta:");
			saldo= read.nextDouble();
			System.out.println("Digite o valor de débito:");
			debito=read.nextDouble();
			System.out.println("Digite o valor de crédito:");
			credito=read.nextDouble();
			
			saldoAtual= saldo-debito+credito;
			if (saldoAtual>=0) {
				System.out.println("Saldo positivo!");
			} else {
				System.out.println("Saldo negativo!");

			}
			
			
		} catch (Exception e) {
			System.out.println("Ei, por favor digite um valor válido!");
		}

	}

}
