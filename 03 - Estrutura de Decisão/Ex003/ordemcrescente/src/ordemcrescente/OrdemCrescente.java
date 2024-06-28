package ordemcrescente;
import java.util.Scanner;

public class OrdemCrescente {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		double x;
		
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		System.out.print("Digite o terceiro número: ");
		num3 = sc.nextDouble();
		
		if (num1 > num3) {
			x = num1;
			num1 = num3;
			num3 = x;
		}
		if (num2 > num3) {
			x = num2;
			num2 = num3;
			num3 = x;
		}
		if (num1 > num2) {
			x = num1;
			num1 = num2;
			num2 = x;
		}
		
		System.out.printf("Ordem Crescente: %.1f, %.1f, %.1f", num1, num2, num3);
		sc.close();
	}

}

/*Faça um programa que receba como entrada três valores e os imprima em ordem crescente.*/