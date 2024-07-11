package funcaoRecursivaSoma;

import java.util.Scanner;

public class FuncaoRecursivaSoma {
	public static int somarAteN(int numero) {
		
		
		if (numero == 0) {
			return numero;
		} else {
			return numero += somarAteN(numero - 1);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo: ");
		int numero = sc.nextInt();
		
		sc.close();
		
		System.out.println(somarAteN(numero));
	}

}

/*Crie uma função recursiva que receba um número inteiro positivo N e calcule 
 * o somatório dos números de 1 a N
 */