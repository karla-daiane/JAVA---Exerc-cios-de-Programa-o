package uniaoIntersecaoDiferenca;

public class UniaoIntersecaoDiferenca {
	public static void main(String[] args) {
		int vetorA[] = {2, 4, 7, 13, 14, 15, 16};
		int vetorB[] = {1, 6, 7, 11, 13, 16, 18};
		int vetorUniao[] = new int[vetorA.length + vetorB.length];
		int vetorDiferenca[] = new int[vetorA.length + vetorB.length];
		boolean diferente;
		
		System.out.print("> Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("\n> Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		//A ⋃ B: União (todos os valores de ambos os vetores)
		for (int i = 0; i < vetorA.length; i++) {
			vetorUniao[i] = vetorA[i];
			vetorUniao[i + vetorA.length] = vetorB[i];
		}
		
		System.out.print("\n\n> Vetor União A e B: ");
		for (int i = 0; i < vetorUniao.length; i++) {
			System.out.print(vetorUniao[i] + " ");
		}
		
		//A ⋂ B: Intersecção (apenas valores que existam em ambos)
		System.out.print("\n\n> Intersecção A e B: ");
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {
					System.out.print(vetorA[i] + " ");
				}
			}
		}
		
		//A − B: Diferença (apenas valores que não apareçam simultaneamente em ambos conjuntos)
		System.out.print("\n\n> Diferença A e B: ");
		for (int i = 0; i < vetorA.length; i++) {
			diferente = true;
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {
					diferente = false;
					break;
				} 	
			}
			
			if (diferente) {
				vetorDiferenca[i] = vetorA[i];
				System.out.print(vetorA[i] + " ");
			}
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			diferente = true;
			for (int j = 0; j < vetorA.length; j++) {
				if (vetorB[i] == vetorA[j]) {
					diferente = false;
					break;
				} 	
			}
			
			if (diferente) {
				vetorDiferenca[i] = vetorA[i];
				System.out.print(vetorB[i] + " ");
			}
		}
	}
	
}

/*Faça um programa que defina dois vetores A = [2, 4, 7, 13, 14, 15, 16] 
 * e B = [1, 6, 7, 11, 13, 16, 18] e faça as seguintes operações de conjuntos:

> A ⋃ B: União (todos os valores de ambos os vetores)
> A ⋂ B: Intersecção (apenas valores que existam em ambos)
> A − B: Diferença (apenas valores que não apareçam simultaneamente em ambos conjuntos)
*/