package volumecaixaretangular;
import java.util.Scanner;

public class VolumeCaixaRetangular {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o valor do largura: ");
		double largura = sc.nextDouble();
		System.out.println("Digite o valor do altura: ");
		double altura = sc.nextDouble();
		
		double volume = comprimento * largura * altura;
		System.out.printf("O volume da caixa retangular é: %.1f.", volume);
		
		sc.close();
	}
}

/*Faça um programa que leia os valores de COMPRIMENTO, LARGURA e ALTURA e 
 * apresente o valor do volume de uma caixa retangular. Utilize para o 
 * cálculo a fórmula VOLUME = COMPRIMENTO × LARGURA × ALTURA.
 */