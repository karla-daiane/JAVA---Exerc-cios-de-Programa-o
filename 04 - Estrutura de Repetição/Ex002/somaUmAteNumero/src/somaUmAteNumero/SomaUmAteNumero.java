package somaUmAteNumero;

import java.util.Scanner;

public class SomaUmAteNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroUsuario;
		int numero;
		int soma;
		
		System.out.println("> Insira um número inteiro: ");
		numeroUsuario = sc.nextInt();
		numero = 1;
		soma = 0;
		
		while (numero <= numeroUsuario) {
			soma += numero;
			numero++;
		}
		
		System.out.printf("> A soma de 1 até %d é: %d", numeroUsuario, soma);
		
		sc.close();
	}

}

/*Escreva um programa que pergunte ao usuário um número e após, escreva na 
 * tela a soma total de 1 até o número lido. 
 * Exemplo: 5: 1 + 2 + 3 + 4 + 5 = 15
 */