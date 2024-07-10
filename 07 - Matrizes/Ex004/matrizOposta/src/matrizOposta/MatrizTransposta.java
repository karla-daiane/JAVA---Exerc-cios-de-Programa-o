package matrizOposta;

public class MatrizTransposta {

	public static void main(String[] args) {
		int matrizA[][] = {
				{-7, 8},
				{4, 9},
				{2, 1}
		};
		
		int matrizTransposta[][] = new int[2][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				matrizTransposta[j][i] = matrizA[i][j];
			}
		}
		
		System.out.println("Matriz A: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nMatriz Transposta: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrizTransposta[i][j] + " ");
			}
			System.out.println();
		}
	}

}

/*Faça um programa que dada a seguinte matriz A, gere a matriz transposta 
* dela At. Matriz transposta é a que se obtém trocando-se ordenadamente 
* as linhas pelas colunas.
* 
* A =	-7	|8
* 		 4	|9
* 		 2	|1
* 
* At =	-7	|4	|2
* 		 8	|9	|1
*/