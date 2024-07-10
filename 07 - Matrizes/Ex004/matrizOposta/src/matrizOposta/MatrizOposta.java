package matrizOposta;

public class MatrizOposta {

	public static void main(String[] args) {
		int matrizA[][] = {
				{2, -3},
				{-1, 4}
		};
		
		int matrizOposta[][] = new int[matrizA.length][matrizA.length];
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				matrizOposta[i][j] = matrizA[i][j] * -1;
				System.out.printf("%d + %d = %d \n",matrizA[i][j], matrizOposta[i][j], matrizA[i][j] + matrizOposta[i][j]);
			}
		}
	}

}

/*Faça um programa que dada a matriz A, gere a matriz oposta -A. Matriz oposta 
 * possui valores que se somados à matriz original, gera uma matriz com 
 * valores zerados.
 * 
 * A =	2	|-3
 * 		-1	|4
*/