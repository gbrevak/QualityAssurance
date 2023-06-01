package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio26 {
// Faça  um  algoritmo  para  ler:  quantidade  atual  em  estoque,  quantidade 
//	máxima  em  estoque  e quantidade  mínima  em  estoque  de  um  produto.  Calcular  
//	e  escrever  a  quantidade  média  ((quantidade média = quantidade máxima + 
//	quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a  quantidade
//	média  escrever  a  mensagem  'Não  efetuar  compra',  senão  escrever  a  mensagem 
//	'Efetuar compra'. 
	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			System.out.println("Por gentileza, digite a quantidade atual do estoque: ");
			int atualestoque = read.nextInt();
			System.out.println("Por gentileza, digite a quantidade máxima em estoque: ");
			int quantmax = read.nextInt();
			System.out.println("Por gentileza, digite a quantidade mínima em estoque: ");
			int quantmin = read.nextInt();
			int quantmedia = (quantmax + quantmin)/2;
			if (atualestoque >= quantmedia) {
				System.out.println("Não efetuar compra.");
			} else {
				System.out.println("Efetuar compra.");
			}
		} catch (Exception e) {
			System.out.println("Ei, por gentileza, digite um valor válido!");
		}

	}

}
