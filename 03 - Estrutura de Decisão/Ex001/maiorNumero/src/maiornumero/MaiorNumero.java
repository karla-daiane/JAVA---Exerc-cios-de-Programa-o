package maiornumero;
import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero1;
		double numero2;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		numero2 = sc.nextDouble();
		
		if (numero1 > numero2) {
			System.out.printf("> O número %.1f é Maior.", numero1);
		} else if (numero1 < numero2) {
			System.out.printf("> O número %.1f é Maior.", numero2);
		} else {
			System.out.printf("> O %.1f e %.1f são iguais.", numero1, numero2);
		}
		
		sc.close();		
	}

}

/*Faça um programa que peça dois números e imprima o maior deles.*/