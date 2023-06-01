package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// O  custo  de  um  carro  novo  ao  consumidor  é  a  soma  do  custo  de  
		//fábrica  com  a  porcentagem  do distribuidor e dos impostos (aplicados 
		//ao custo de fábrica). Supondo que o percentual do distribuidor seja  de  28% 
		//e  os  impostos  de  45%,  escrever  um  algoritmo  para  ler o  custo  de  
		//fábrica  de  um  carro, calcular e escrever o custo final ao consumidor. 
Scanner read=new Scanner (System.in);
	System.out.println("Olá! Por gentileza, informe o custo de fábrica do veículo:");
	float ve = read.nextFloat();
	double vimpd= ve*0.28;
	double imp = ve*0.45;
	double vf = vimpd+imp+ve;
	System.out.println("O custo final desse veículo é de R$"+vf+".");
	System.out.println("Custo do distribuidor: R$"+vimpd+".");
	System.out.println("Custo de impostos: R$"+imp+".");
	
	}

}
