package emprestimoBancario;
import java.util.Scanner;

public class EmprestimoBancario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valorEmprestimo;
		int numeroParcelas;
		double salario;
		double valorParcela;
		double limiteMaximo;
		
		System.out.print("Digite o valor do empréstimo: R$ ");
		valorEmprestimo = sc.nextDouble();
		System.out.print("Digite o número de parcelas: ");
		numeroParcelas = sc.nextInt();
		System.out.print("Digite o valor do salário: R$ ");
		salario = sc.nextDouble();
		
		valorParcela = valorEmprestimo / numeroParcelas;
		limiteMaximo = salario * 0.3;
		
		if (valorParcela <= limiteMaximo) {
			System.out.printf("\n> O empréstimo de R$ %.2f foi Aprovado.", valorEmprestimo);
		} else {
			System.out.printf("\n> O empréstimo de R$ %.2f foi Reprovado.", valorEmprestimo);
		}
		
		sc.close();
	}

}

/*Faça um programa para aprovar empréstimos bancários. O código deve pedir três 
 * informações: valor do empréstimo, número de parcelas e salário do solicitante. 
 * Aprovar empréstimo caso o valor das parcelas representem no máximo 30% do 
 * salário do solicitante.*/