package matrizSomaAB;

public class MatrizSomaAB {

	public static void main(String[] args) {
		int matrizA[][] = {
				{-10, 1, 4, 6},
				{2, 3, 2, 8},
		};
		
		int matrizB[][] = {
				{1, 8, 4, -1},
				{0, 6, 3, -3},
		};
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("A soma de %d + %d = %d\n", matrizA[i][j], matrizB[i][j], matrizA[i][j] + matrizB[i][j]);
			}
		}
	}

}

/*Dada as matrizes A e B determine A + B.
 * A =	-10	|1	|4	|6
 * 		2	|3	|2	|8
 *      
 * B =	1	|8	|4	|-1
 * 		0	|6	|3	|-3
*/