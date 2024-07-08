package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int resultado;
		
		System.out.println("> Informe o número da tabuada: ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println();
			for  (int j = 0; j <= 10; j++) {
				resultado = i * j;
				System.out.printf("\n> %d * %d = %d", i, j, resultado);
			}
		}
		
		sc.close();

	}

}

/*Construa um programa que exiba a tabuada de 1 até N, onde N é informado pelo 
 * usuário. ex: Até a tabuada de 3, irá imprimir as tabuadas de 1, 2 e 3.
 */