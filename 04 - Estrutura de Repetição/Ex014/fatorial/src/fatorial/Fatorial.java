package fatorial;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int fatorial;
		
		System.out.println("Digite o número para calcular o fatorial: ");
		numero = sc.nextInt();
		fatorial = numero;
		
		if (numero == 0) {
			fatorial = 1;
			System.out.printf("\n %d! (%d fatorial) = %d", numero, numero, fatorial);
		} else if (numero < 0) {
			System.out.println("\nNão se calcula o fatorial de números negativos.");
		} else{
			for (int i = 1; i < numero; i++) {
				fatorial *= i;
			}
			System.out.printf("\n %d! (%d fatorial) = %d", numero, numero, fatorial);
		}
		
		
		
		sc.close();
	}

}

/*Escreva um programa que determine o fatorial de um número. Para este 
 * problema, tem-se como entrada o valor do número do qual se deseja 
 * calcular o fatorial. O fatorial de 0 é igual a 1. O fatorial de um 
 * número N(N!) é definido conforme a seguir:
 * N! = 1 × 2 × 3 × 4 × ... × (N - 1) × N
*/