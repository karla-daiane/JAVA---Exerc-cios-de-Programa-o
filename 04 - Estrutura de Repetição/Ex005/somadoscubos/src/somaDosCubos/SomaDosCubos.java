package somaDosCubos;
import java.util.Scanner;

public class SomaDosCubos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numA;
		int numB;
		int soma = 0;
		
		System.out.println("Digite o menor número: ");
		numA = sc.nextInt();
		System.out.println("Digite o maior número: ");
		numB = sc.nextInt();
		
		for (int i = numA + 1; i < numB; i++) {
			if (i % 2 == 0) {
				soma += Math.pow(i, 3);
			}
		}
		
		System.out.println("A soma é: " + soma);
		
		sc.close();
	}

}

/*Faça um programa para calcular e escrever a soma dos cubos dos números pares 
 * compreendidos entre A e B (B > A). A e B são lidos pelo teclado.
 */