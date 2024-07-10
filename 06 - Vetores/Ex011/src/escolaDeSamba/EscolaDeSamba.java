package escolaDeSamba;
import java.util.Arrays;

public class EscolaDeSamba {

	public static void main(String[] args) {
		double notas[] = {9.9, 9.7, 9.8, 10, 10};
		double soma = 0;
		double media;
		
		Arrays.sort(notas);
		
		System.out.println("Notas da escola de samba: ");
		for (double nota : notas) {
			System.out.print(nota + " ");
		}
		
		for (int i = 1; i < notas.length - 1; i++) {
			soma += notas[i];
		}
		
		media = soma / (notas.length - 2);
		System.out.printf("\n\n> A nota média é: %.1f.", media);

	}

}

/*Uma escola de samba recebeu como pontos pela alegoria os seguintes 5 valores 
 * inclusos no vetor Notas. Lembrando que a nota mais alta e a nota mais baixa 
 * são descartadas. Faça um programa que calcule a média final do quesito.
 *
 * Notas = [9.9, 9.7, 9.8, 10, 10]
 */