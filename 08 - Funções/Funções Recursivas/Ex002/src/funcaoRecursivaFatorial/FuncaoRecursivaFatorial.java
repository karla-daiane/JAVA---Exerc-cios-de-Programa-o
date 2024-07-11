package funcaoRecursivaFatorial;

import java.util.Scanner;

public class FuncaoRecursivaFatorial {
	public static int calcularFatorial(int numero) {
		if (numero == 0) {
			return 1;
		} else {
			return numero *= calcularFatorial(numero - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo: ");
		int numero = sc.nextInt();
		
		sc.close();
		
		System.out.println(calcularFatorial(numero));
	}

}

/*Faça uma função recursiva que calcule e retorne o fatorial de um número inteiro N.*/