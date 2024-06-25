package trocavalorvariável;

public class TrocaValorVariavel {
	public static void main(String[] args) {
		
		int varA = 10;
		int varB = 20;
		int varX;
		
		varX = varA;
		varA = varB;
		varB = varX;
		
		System.out.printf("O valor armazenado nas variáveis são: \n"
				+ "- Variável A: %d \n"
				+ "- Variável B: %d \n", varA, varB);
	}
}

/*Faça um programa que armazene o valor 10 em uma variável A e o valor 20 em 
 * uma variável B. A seguir (utilizando apenas atribuições entre variáveis) 
 * troque os seus conteúdos fazendo com que o valor que está em A passe para 
 * B e vice-versa. Ao final, escrever os valores que ficaram armazenados nas 
 * variáveis.
 */