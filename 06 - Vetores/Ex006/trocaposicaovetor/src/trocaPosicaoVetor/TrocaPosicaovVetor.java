package trocaPosicaoVetor;

public class TrocaPosicaovVetor {
	public static void main(String[] args) {
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int temp;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		for (int i = 0; i < (numeros.length / 2); i++) {
			temp = numeros[i];
			numeros[i] = numeros[numeros.length -1 -i];
			numeros[numeros.length -1 -i] = temp;
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

}

/*Escrever um programa que lê um vetor com 20 números inteiros e o escreve na 
 * tela. Troque, a seguir, o 1º elemento com o último, o 2º com o penúltimo 
 * etc. até o 10º com o 11º e escreva na tela o vetor N assim modificado.
 */