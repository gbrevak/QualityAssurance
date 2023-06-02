package apostilaManzano;

public class Exerc5111e {
//Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. 
//Deve ser considerado  que  qualquer  número  elevado  a  zero  é  1,  e  elevado  a  1 
//é  ele  próprio.  Observe  que neste exercício não pode ser utilizado o operador de 
//exponenciação do portuguol (^). 
	public static void main(String[] args) {
		try {
			int resp = 1;
			System.out.println("Apresentando o resultado das potências de 3, do expoente 0 ao 15:");
			System.out.println("3 elevado a 0 é igual a "+resp+".");
			
			for (int i = 1; i < 16; i++) {
				resp = resp * 3;
				System.out.println("3 elevado a " + i + " é igual a " + resp+ ".");
			}

		} catch (Exception e) {
			System.out.println("Por gentileza, reinicie o programa e digite um valor válido!");
		}

	}

}
