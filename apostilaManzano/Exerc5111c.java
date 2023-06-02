package apostilaManzano;

public class Exerc5111c {
// Elaborar um programa que apresente no final o somatório dos valores pares 
//existentes na faixa de 1 até 500. 
	public static void main(String[] args) {
		try {
			System.out.println("Apresentando os valores da soma dos números pares existentes entre 1 e 500:");
			int cont = 0;
			for(int i = 0;i<501;i++) {
				if (i%2==0) {
					cont=cont+i;
					System.out.println(cont);
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("Por gentileza, reinicie o programa e digite um valor válido!");
		}

	}

}
