package apostilaManzano;

public class Exerc5111b {
//Apresentar o total da soma obtida dos cem primeiros números inteiros
//(1+2+3+4+...+98+99+100). 
	public static void main(String[] args) {
	try {
		System.out.println("Apresentando o total da soma obtida dos primeiros 100 números inteiros:");
		int cont=0;
		
		for (int i = cont; i <= 100; i++) {
            cont=cont+ i;
            System.out.println(cont);
        }
		
	} catch (Exception e) {
		System.out.println("Por gentileza, reinicie o programa e digite um valor válido!");
		
	}}

}
