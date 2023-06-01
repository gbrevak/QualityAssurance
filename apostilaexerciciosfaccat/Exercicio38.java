package apostilaexerciciosfaccat;

import java.util.Scanner;

// Faça  um  algoritmo  para  ler  um  número  que  é  um  código  de  usuário.  
//Caso  este  código  seja diferente  de  um  código  armazenado  internamente  
//no  algoritmo  (igual  a 1234)  deve  ser  apresentada  a mensagem ‘Usuário inválido!’.
//Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha 
//estiver incorreta (a certa  é 9999) deve ser mostrada a mensagem ‘senha incorreta’. 
//Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
public class Exercicio38 {

	public static void main(String[] args) {
		try {
			Scanner read = new Scanner(System.in);
			System.out.println("Por gentileza, digite o código do usuário:");
			int cod = read.nextInt();
			if (cod != 1234) {
				System.out.println("Usuário inválido.");
			}else {
				System.out.println("Por favor, digite a senha:");
				int senha = read.nextInt();
				if(senha!=9999) {
					System.out.println("Senha incorreta.");
				}else {
					System.out.println("Acesso permitido.");
				}
			}
		} catch (Exception e) {
			System.out.println("Por gentileza, reinicie o programa e digite valores válidos!");
		}

	}

}
