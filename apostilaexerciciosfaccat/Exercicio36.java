package apostilaexerciciosfaccat;

import java.util.Scanner;

public class Exercicio36 {
// Escreva  um  algoritmo  que  leia  as  idades  de  2  homens  e  de  2  mulheres 
//	(considere  que  as  idades dos  homens  serão  sempre  diferentes  entre  si, 
//			bem  como  as  das  mulheres).  Calcule  e  escreva  a  soma das  idades  
//	do  homem  mais  velho  com  a  mulher  mais  nova,  e  o  produto  das  idades  
//	do  homem  mais novo com a mulher mais velha. 
	public static void main(String[] args) {
		try {
			Scanner read = new Scanner (System.in);
			System.out.println("Por gentileza, escreva a idade do primeiro homem:");
			int idadehomem1 = read.nextInt();
			System.out.println("Por gentileza, escreva a idade do segundo homem:");
			int idadehomem2 = read.nextInt();
			System.out.println("Por gentileza, escreva a idade da primeira mulher:");
			int idademulher1 = read.nextInt();
			System.out.println("Por gentileza, escreva a idade da segunda mulher:");
			int idademulher2 = read.nextInt();
			if (idadehomem1==idadehomem2 || idademulher1==idademulher2) {
				System.out.println("Ei, idades iguais não são permitidas.");
			} else if ((idadehomem1>idadehomem2) && (idademulher1>idademulher2)) {
				System.out.println("A soma de idades do homem mais velho com a mulher mais nova é de "+(idadehomem1+idademulher2)+".");
			}else if ((idadehomem1<idadehomem2) && (idademulher1>idademulher2)) {
				System.out.println("A soma de idades do homem mais velho com a mulher mais nova é de "+(idadehomem2+idademulher2)+".");
			}else if ((idadehomem1>idadehomem2) && (idademulher1<idademulher2)) {
				System.out.println("A soma de idades do homem mais velho com a mulher mais nova é de "+(idadehomem1+idademulher1)+".");
			}else if ((idadehomem1<idadehomem2) && (idademulher1<idademulher2)) {
				System.out.println("A soma de idades do homem mais velho com a mulher mais nova é de "+(idadehomem2+idademulher1)+".");
			}
			read.close();
		} catch (Exception e) {
			System.out.println("Ei, por gentileza, reinicie o programa e digite um valor válido!");
		}

	}

}
