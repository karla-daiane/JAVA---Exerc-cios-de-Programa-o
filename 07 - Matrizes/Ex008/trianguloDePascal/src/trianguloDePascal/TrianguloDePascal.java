package trianguloDePascal;

public class TrianguloDePascal {

	public static void main(String[] args) {
		int matriz[][] = new int[7][7];
		
		//todos os elementos da primeira coluna da matriz são iguais a 1;
		for (int i = 0; i < 7; i++) {
			matriz[i][0] = 1;
		}
		
		//todos os elementos da diagonal principal da matriz também são iguais a 1;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == j) {
					matriz[i][j] = 1;
				}
			}
		}
		
		//para os demais elementos são obtido pela soma do elemento da mesma coluna na linha de cima com o seu vizinho esquerdo;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i != 0 & i != 1 & j !=0) {
					matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
				}
			}
		}
		
		//Exibir matriz
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		System.out.println();
		}
	}

}

/*Implemente um programa que exiba um triângulo de Pascal (Tartaglia) de 
 * ordem n, sendo n informado pelo usuário. Para tal, considere uma matriz 
 * quadrada de ordem n, o triângulo de Pascal segue a seguinte regra de formação:
 * 
 * - todos os elementos da primeira coluna da matriz são iguais a 1;
 * - todos os elementos da diagonal principal da matriz também são iguais a 1;
 * - para os demais elementos são obtido pela soma do elemento da mesma coluna na linha de cima com o seu vizinho esquerdo;
 * - os elementos acima da diagonal principal não são exibidos.
 * 
 * ex: Triângulo de Pascal de ordem 7:

* 1	  	  	  	  	  	  
* 1	 1	  	  	  	  	  
* 1	 2	 1	  	  	  	  
* 1	 3	 3	 1	  	  	  
* 1	 4	 6	 4	 1	 	  
* 1	 5	10	10	 5	 1	  
* 1	 6	15	20	15	 6	 1
*/