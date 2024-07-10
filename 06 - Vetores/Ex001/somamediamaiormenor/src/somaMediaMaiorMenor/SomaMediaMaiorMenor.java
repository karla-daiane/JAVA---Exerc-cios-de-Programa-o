package somaMediaMaiorMenor;
import java.util.Scanner;
import java.util.Arrays;

public class SomaMediaMaiorMenor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vetor = new double[100];
		double soma = 0;
		double media;
		double maior;
		double menor;
		
		for (int i = 0; i < vetor.length; i++) {
			int c = 1 + i;
			System.out.printf("Digite o %d° valor: ", c);
			vetor[i] = sc.nextInt();
			soma = soma + vetor[i];
		}
		
		Arrays.sort(vetor);
		
		media = soma / vetor.length;
		maior = vetor[vetor.length -1];
		menor = vetor[0];
		
		System.out.println("\n> A soma dos valores é: " + soma);
		System.out.printf("\n> A média dos valores é: %.2f", media);
		System.out.printf("\n> O maior número é: %.1f", maior);
		System.out.printf("\n> O menor númeo é: %.1f\n", menor);
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		sc.close();
	}

}
/*Fazer um algoritmo que calcule e imprima o soma, a média, o maior e o menor 
 * dos valores armazenados em um vetor A de 100 elementos numéricos a serem 
 * lidos do dispositivo de entrada padrão.
 */