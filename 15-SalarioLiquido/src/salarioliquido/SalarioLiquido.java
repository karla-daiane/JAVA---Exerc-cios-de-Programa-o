package salarioliquido;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salarioBruto;
		final double PREVIDENCIA_SOCIAL = 1 - 0.10;
		final double IMPOSTO_DE_RENDA = 1 - 0.05;
		double salarioLiquido;
		
		System.out.print("Digite o valor do Salário Bruto: R$ ");
		salarioBruto = sc.nextDouble();
		salarioLiquido = (salarioBruto * PREVIDENCIA_SOCIAL) * IMPOSTO_DE_RENDA;
		
		System.out.printf("O salário Líquido é de: R$ %.2f. \n", salarioLiquido);
		sc.close();
	}

}

/*Considere a seguinte situação: Descontam-se inicialmente 10% do salário 
 * bruto do trabalhador como contribuição à previdência social. Após esse 
 * desconto, há um outro desconto de 5% sobre o valor restante do salário 
 * bruto, a título de imposto de renda. Faça um programa que leia o salário 
 * bruto de um cidadão e imprima o seu salário líquido.
 */