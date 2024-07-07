package anoBissexto;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano;
				
		System.out.println("Digite o ano: ");
		ano = sc.nextInt();
		
		if (ano % 400 == 0) {
			System.out.printf("> %d é um Ano Bissexto.", ano);
		} else if (ano % 4 == 0 & ano % 100 != 0) {
			System.out.printf("> %d é um Ano Bissexto.", ano);
		} else {
			System.out.printf("> %d NÃO é um Ano Bissexto.", ano);
		}
		
		sc.close();
	}

}

/*Faça um Programa que peça um número correspondente a um determinado ano e em 
 * seguida informe se este ano é ou não bissexto.
 */