package funcaoAnoBissexto;

import java.util.Scanner;

public class FuncaoAnoBissexto {
	public static boolean conferirAnoBissexto(int ano) {
		boolean anoBissexto = false;
		
		if(ano % 400 == 0) {
			anoBissexto = true;
		} else if (ano % 4 == 0 & ano % 100 != 0) {
			anoBissexto = true;
		}
		
		return anoBissexto;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite o ano desejado: ");
		ano = sc.nextInt();
		
		System.out.printf("\nO ano de %d é bissexto? %b", ano, conferirAnoBissexto(ano));
		
		sc.close();
	}
}

/*Crie uma função que receba como parâmetro um inteiro positivo ano e devolve 
 * verdadeiro ou falso se ano for bissexto ou não. Anos bissextos ocorrem a 
 * cada quatro anos exceto anos múltiplos de 100 que não são múltiplos de 400.
 */