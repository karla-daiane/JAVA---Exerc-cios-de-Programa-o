package prefixo;

import java.util.Scanner;

public class Prefixo {
	public static boolean ehPrefixo(String palavra1, String palavra2){
		boolean resultado = false;
		
		if (palavra1.length() < palavra2.length()) {
			if (palavra1.equalsIgnoreCase(palavra2.substring(0, palavra1.length()))) {
				resultado = true;
			}
		} 			
		
		return resultado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira palavra: ");
		String palavra1 = sc.nextLine();
		System.out.println("Digite a primeira palavra: ");
		String palavra2 = sc.nextLine();
		
		sc.close();
		
		boolean resposta = ehPrefixo(palavra1, palavra2);
		
		System.out.printf("\n\n> '%s' é prefixo de '%s': %b", palavra1, palavra2, resposta);
	}

}

/*Crie uma função que receba duas palavras e retorne True caso a primeira 
 * palavra seja um prefixo da segunda.
 */