package copiarVetor;

public class CopiarVetor {
	public static void main(String[] args) {
		int vetor1[] = {0, 1, 2, 3, 4, 5};
		int vetor2[] = new int[vetor1.length];
		
		for (int i = 0; i < vetor1.length; i++) {
			vetor2[i] = vetor1[i];
		}
		
		System.out.print("Vetor 1: >");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print(" " + vetor1[i]);
		}
		
		System.out.print("\nVetor 2: >");
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print(" " + vetor2[i]);
		}
	}
}

/*Faça um programa que copie o conteúdo de um vetor em um segundo vetor.*/