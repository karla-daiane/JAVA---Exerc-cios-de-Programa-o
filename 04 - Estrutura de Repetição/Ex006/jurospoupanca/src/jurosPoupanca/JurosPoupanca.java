package jurosPoupanca;
import java.util.Scanner;

public class JurosPoupanca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valorInicial;
		double rendimentoMensal;
		double valorTotal;
		final double JUROS_POUPANCA = 0.005;
		
		System.out.print("Digite o valor do deposito: R$ ");
		valorInicial = sc.nextDouble();		
		valorTotal = valorInicial;
		
		for (int i = 1; i <= 12; i++) {
			rendimentoMensal = valorTotal * JUROS_POUPANCA;
			valorTotal += rendimentoMensal;
			System.out.printf("\nRendimento %d° mês: R$ %.2f \nValor Total: R$ %.2f\n", i, rendimentoMensal, valorTotal);
			
		}
		
		sc.close();
	}

}

/*Faça um programa que receba um valor que foi depositado na poupança e exiba 
 * o valor com rendimento mês a mês durante o período de um ano. Considere 
 * fixo o juros da poupança em 0,5% a. m.
 */