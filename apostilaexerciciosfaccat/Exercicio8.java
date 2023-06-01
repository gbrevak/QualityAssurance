package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler o número total de eleitores de um município,
		//o número de votos brancos, nulos e válidos. Calcular e escrever o percentual
		//que cada um representa em relação ao total de eleitores.
		Scanner read = new Scanner (System.in);
		System.out.println("Olá! Por gentileza, digite o valor total de votos do município:");
		int totalvotos = read.nextInt();
		System.out.println("Dos "+totalvotos+", quantos foram em branco?");
		int votosembranco=read.nextInt();
		System.out.println("Dos "+totalvotos+", quantos foram nulos?");
		int votosnulos=read.nextInt();
		int votosvalidos=totalvotos-votosembranco-votosnulos;
		double porcvotosb = (votosembranco*100)/totalvotos;
		double porcvotosn = (votosnulos*100)/totalvotos;
		double porcvotosv = (votosvalidos*100)/totalvotos;
				System.out.println("O total de votos foi de "+totalvotos+".\nForam digitados "+votosembranco+" votos em branco, representando um percentual de "+porcvotosb+"%.");
				System.out.println("Foram digitados "+votosnulos+" votos nulos, representando um percentual de");
				System.out.println("O percentual de votos brancos é de "+porcvotosn+"%.");
				System.out.println("Foram digitados "+votosvalidos+" votos válidos, representando um percentual de "+porcvotosv+"%.");
		
	
	
	}

}
