package digitosPorExtenso;

import java.util.Scanner;

public class DigitosPorExtenso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeros;
		String stringNumeros;
		String extenso[] = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		
		System.out.println("Digite o valor numérico: ");
		numeros = sc.nextInt();
		stringNumeros = Integer.toString(numeros);
		String resultado[] = new String[stringNumeros.length()];
		
		for (int i = 0; i < stringNumeros.length(); i++) {
			resultado[i] = extenso[Character.getNumericValue(stringNumeros.charAt(i))];
			//i < (stringNumeros.length() - 1) ? System.out.print(resultado[i] + ", ") : System.out.print(resultado[i]);
			if (i < (stringNumeros.length() - 1) ) {
				System.out.print(resultado[i] + ", ");
			} else {
				System.out.print(resultado[i]);
			}
		}
		
		
		
		sc.close();
	}

}

/*Escreva um programa que dado um valor numérico digitado pelo usuário 
 * (armazenado em uma variável inteira), imprima cada um dos seus dígitos 
 * por extenso. 
 * Exemplo:
 * Entre o número: 4571
 * Resultado: quatro, cinco, sete, um
*/