package lerImprimirMatriz;

import java.util.Scanner;

public class LerImprimirMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[2][4];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("Digite o número inteiro do ídice [%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMatriz: ");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}

/*Faça um programa para ler e imprimir uma matriz 2 × 4 de números inteiros.*/