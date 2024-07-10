package funcaoSomaNumeros;

import java.util.Scanner;

public class FuncaoSomaNumeros {
	
	public static double somarNumeros(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, num3, resultado;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextDouble();
		System.out.println("Digite o terceiro número: ");
		num3 = sc.nextDouble();
		
		resultado = somarNumeros(num1, num2, num3);
		System.out.printf("\nResultado soma: %.1f + %.1f + %.1f = %.1f", num1, num2, num3, resultado);
		
		sc.close();
	}

}

/*Crie uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.*/