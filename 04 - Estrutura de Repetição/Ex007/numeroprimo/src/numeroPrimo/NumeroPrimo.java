package numeroPrimo;
import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite o número: ");
		numero = sc.nextInt();
		
		if (numero > 1) {
			for (int i = 2; i <= numero; i++) {
				if (i != 2 & i != 3 & i != 5 & i != 7) {
					if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
					continue;
					} else {
						System.out.print(i + " ");
					}
				} else {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("O número informado NÃO É primo.");
		}
		
		
		sc.close();
	}

}

/*Número primo é aquele que só é divisível por ele mesmo e pelo número 1. Faça 
 * um programa que determine e escreva os números primos compreendidos entre 
 * um intervalo fornecido pelo usuário.
 */