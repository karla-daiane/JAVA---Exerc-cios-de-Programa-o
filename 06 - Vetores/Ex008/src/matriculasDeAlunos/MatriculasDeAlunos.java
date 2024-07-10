package matriculasDeAlunos;

import java.util.Scanner;

public class MatriculasDeAlunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matriculas[] = new int[5];
		int numeroMatricula;
		boolean matriculaExistente = false;
		
		
		for (int i = 0; i < matriculas.length; i++) {
			System.out.println("Digite o número da matrícula: ");
			numeroMatricula = sc.nextInt();
			for (int j = 0; j < matriculas.length; j++) {
				
				if (numeroMatricula == matriculas[j]) {
					matriculaExistente = true;
					break;
				}
			}
		
			if (matriculaExistente) {
				System.out.printf("\n>! O número de matrícula %d já está cadastrado.", numeroMatricula);
				System.out.println("Digite outro número de matrícula: ");
				i--;
				matriculaExistente = false;
			} else {
				matriculas[i] = numeroMatricula;
			}
		}
		
		System.out.println("\nMatriculas Cadastradas com sucesso!");
		System.out.println("__________________________________________\n");		
		System.out.print("Matriculas Cadastradas no sistema: \n");
		for (int matricula : matriculas) {
			System.out.printf("\nNúmero de Matrícula: %d", matricula);
		}
		
		sc.close();
	}

}

/*Ler 100 números de matriculas de alunos e armazenar em um vetor. Esses 
 * números são distintos, ou seja, não existem números de matriculas iguais. 
 * Caso o usuário informa um número de matrículo que já existe, o programa 
 * deverá emitir um alerta.
 */