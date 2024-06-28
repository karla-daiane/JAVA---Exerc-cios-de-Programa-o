package maiordetres;
import java.util.Scanner;

public class MaiorDeTres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		double maiorNum;
		
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		System.out.print("Digite o terceiro número: ");
		num3 = sc.nextDouble();
		
		maiorNum = num1;
		
		if (maiorNum < num2) {
			maiorNum = num2;
		}
		if (maiorNum < num3) {
			maiorNum = num3;
		}
		
		System.out.printf("O número maior é: %.1f.", maiorNum);

		sc.close();
	}

}

/*Faça um programa que leia três números e mostre o maior deles.*/