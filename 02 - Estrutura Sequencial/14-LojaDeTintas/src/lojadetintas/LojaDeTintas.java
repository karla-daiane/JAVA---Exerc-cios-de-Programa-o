package lojadetintas;
import java.util.Scanner;

public class LojaDeTintas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area;
		final double VALOR_LATA = 80.00;
		final int AREA_COBERTURA_LATA = 18 * 3;
		int qtdLatas;
		double valorTotal;
		
		System.out.println("Digite o tamanho em M² da área a ser pintada: ");
		area = sc.nextDouble();
		
		qtdLatas = (int)Math.ceil(area / AREA_COBERTURA_LATA);
		valorTotal = qtdLatas * VALOR_LATA;
		
		System.out.printf("É necessário %d Lata(s) de 18L. \n"
				+ "Valor Total: R$ %.2f.", qtdLatas, valorTotal);
		sc.close();
	}
}

/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho 
 * em metros quadrados da área a ser pintada. Considere que a cobertura da 
 * tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em 
 * latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades 
 * de latas de tinta a serem compradas e o preço total.
 */