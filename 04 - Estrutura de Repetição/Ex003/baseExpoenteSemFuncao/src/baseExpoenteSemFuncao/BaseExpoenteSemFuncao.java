package baseExpoenteSemFuncao;

import java.util.Scanner;

public class BaseExpoenteSemFuncao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numeroA;
		double numeroB;
		double potencia;
		int i;
		
		System.out.println("> Digite o número para a base: ");
		numeroA = sc.nextDouble();
		System.out.println("> Digite o número para o expoente: ");
		numeroB = sc.nextDouble();
		
		potencia = 1;
		i = 1;
		
		while (i <= numeroB) {
			potencia = potencia * numeroA;
			i++;
		}

		System.out.printf("\n > %.0f ^ %.0f = %.0f", numeroA, numeroB, potencia);
		
		sc.close();

	}

}

/*Faça um programa que peça dois números, base e expoente, calcule e mostre o 
 * primeiro número elevado ao segundo número. Não utilize a função de 
 * potência da linguagem.
 */