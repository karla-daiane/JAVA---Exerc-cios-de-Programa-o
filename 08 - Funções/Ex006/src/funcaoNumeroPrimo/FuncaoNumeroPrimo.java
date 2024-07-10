package funcaoNumeroPrimo;

import java.util.Scanner;

public class FuncaoNumeroPrimo {
	public static boolean verificanrNumeroPrimo(int numero) {
		boolean ehPrimo = true;
		
		if (numero <= 1) {
			ehPrimo = false;
		} 
		
		for  (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				ehPrimo = false;
				break;
			}
		}
				
		return ehPrimo;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int numero = sc.nextInt();
		
		sc.close();
		
		boolean resposta = verificanrNumeroPrimo(numero);
		System.out.printf("O número %d é primo: %b", numero, resposta);
	}
}

/*Número primo é aquele que só é divisível por ele mesmo e pelo número 1. 
 * Crie uma função que retorne verdadeiro ou falso se o número passado é 
 * primo ou não.
 */