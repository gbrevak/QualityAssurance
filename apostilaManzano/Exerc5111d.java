package apostilaManzano;

public class Exerc5111d {
//Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. 
//Para verificar se o número é ímpar, efetuar dentro da malha a verificação lógica
//desta condição com a instrução se, perguntando se o número é ímpar; sendo, mostre-o;
//não sendo, passe para o próximo passo. 
	public static void main(String[] args) {
		try {
			System.out.println("Apresentando todos os valores inteiroe e ímpares na faixa entre 1 e 20:");
			int cont = 0;
			for (int i = 0; i < 21; i++) {
				if (i % 2 != 0) {
					cont = cont + i;
					System.out.println(cont);
				}

			}

		} catch (Exception e) {
			System.out.println("Por gentileza, reinicie o programa e digite um valor válido!");
		}

	}

}
