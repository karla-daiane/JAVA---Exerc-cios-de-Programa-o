package vetorParImpar;

public class VetorParImpar {
	public static void main(String[] args) {
		int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int pares[] = new int[numeros.length];
		int impares[] = new int[numeros.length];
		int x = 0;
		int y = 0;
		
		System.out.println("Vetor original: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				pares[x] = numeros[i];
				x++;
			} else {
				impares[y] = numeros[i];
				y++;
			}
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println("\n\nVetor números pares: ");
		for(int par : pares) {
			if (par != 0) {
				System.out.print(par + " ");
			}
		}
		
		System.out.println("\n\nVetor números impares: ");
		for(int impar : impares) {
			if (impar != 0) {
				System.out.print(impar + " ");
			}
		}
	}
}

/*Faça um programa que leia um vetor com N elementos formado por valores do 
 * tipo inteiro. Crie então dois novos vetores, um com os valores pares e 
 * outro com os valores ímpares do vetor original.
 */