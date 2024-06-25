package reajustesalario;
import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double salarioMinimo;
		double salarioFinal;
		
		System.out.print("Informe o valor do salário: ");
		salario = sc.nextDouble();
		
		salarioMinimo = 1412.00;
		
		if (salario < salarioMinimo * 3) {
			salarioFinal = salario + (salario * 0.50);
		} else if (salario >= salarioMinimo * 3 && salario <= salarioMinimo * 10) {
			salarioFinal = salario + (salario * 0.20);
		} else if (salario > salarioMinimo * 10 && salario <= salarioMinimo * 20) {
			salarioFinal = salario + (salario * 0.15);
		} else {
			salarioFinal = salario + (salario * 0.10);
		}
		
		System.out.printf("\n--> Salário inicial: R$%.2f. \n--> Salário reajustado: R$%.2f.",salario, salarioFinal);
		
		sc.close();
	}

}

/*Faça um programa para uma empresa que decide dar um reajuste aos funcionários de 
 * acordo com os seguintes critérios:

-> 50% para aqueles que ganham menos do que três salários mínimos;
-> 20% para aqueles que ganham entre três até dez salários mínimos;
-> 15% para aqueles que ganham acima de dez até vinte salários mínimos;
-> 10% para os demais funcionários.*/
