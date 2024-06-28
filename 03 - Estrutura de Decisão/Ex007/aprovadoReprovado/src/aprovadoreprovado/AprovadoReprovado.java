package aprovadoreprovado;
import java.util.Scanner;

public class AprovadoReprovado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		double notaExame;
		double novaMedia;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Informe a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Informe a terceira nota: ");
		nota3 = sc.nextDouble();
		System.out.print("Informe a quarta nota: ");
		nota4 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 7) {
			System.out.printf("\nO aluno(a) foi Aprovado(a) com a média de %.2f.", media);
		} else {
			System.out.print("\nInforme a nota do exame: ");
			notaExame = sc.nextDouble();
			novaMedia = (media + notaExame) / 2;
			
			if (novaMedia >= 5) {
				System.out.printf("\nO aluno(a) foi Aprovado(a) com a média de %.2f.", novaMedia);
			} else {
				System.out.printf("\nO aluno(a) foi Reprovado(a) com a média de %.2f.", novaMedia);
			}
		}
		
		sc.close();
	}
}

/*Faça um programa onde serão informados as quatro notas do aluno. O programa 
 * irá então apresentar a média, se foi aprovado (nota ≥ 7) ou se ficou em 
 * exame. Caso o aluno ficou em exame, o programa irá então perguntar qual foi 
 * a nota do exame e então irá calcular a nova média (média anteior com a nota 
 * do exame) e informar se ele foi aprovado (nova média ≥ 5) ou se foi reprovado.
 */