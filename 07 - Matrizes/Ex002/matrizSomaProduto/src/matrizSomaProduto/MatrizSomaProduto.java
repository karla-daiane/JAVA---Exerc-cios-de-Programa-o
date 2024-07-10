package matrizSomaProduto;

public class MatrizSomaProduto {

	public static void main(String[] args) {
		int matriz[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16},
		};
		
		int somaColuna = 0;
		int produtoLinha = 1;
		int somaTotal = 0;
		int produtoDiagonal = 1;
		
		//Soma coluna e produto linha;
		for (int i = 0; i < 4; i++) {
			somaColuna += matriz[i][0];
			produtoLinha *= matriz[0][i];
		}
		System.out.printf("Soma Coluna: %d \nProduto Linha: %d\n", somaColuna, produtoLinha);
		
		//Soma Total;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				somaTotal += matriz[i][j];
			}
		}
		System.out.printf("Soma de todos os elementos: %d\n", somaTotal);
		
		//Produto da diagonal principal.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					produtoDiagonal *= matriz[i][j];
				}
			}
		}
		System.out.printf("Soma de todos os elementos: %d\n", produtoDiagonal);
	}

}

/*Dada a seguinte matriz, calcule:
 * A soma dos elementos de primeira coluna;
 * O produto dos elementos da primeira linha;
 * A soma de todos os elementos;
 * O produto da diagonal principal.
 *
 *	1	|2	|3	|4
 *	5	|6	|7	|8
 *	9	|10	|11	|12
 *	13	|14	|15	|16
*/