package somamultiplicacao;
import java.util.Scanner;

public class SomaMultiplicacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double d;
		double abSoma;
		double acSoma;
		double adSoma;
		double bcSoma;
		double bdSoma;
		double cdSoma;
		double abMulti;
		double acMulti;
		double adMulti;
		double bcMulti;
		double bdMulti;
		double cdMulti;
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = sc.nextDouble();
		System.out.println("Digite o valor de D: ");
		d = sc.nextDouble();
		
		abSoma = a + b;
		acSoma = a + c;
		adSoma = a + d;
		bcSoma = b + c;
		bdSoma = b + d;
		cdSoma = c + d;
		
		abMulti = a * b;
		acMulti = a * c;
		adMulti = a * d;
		bcMulti = b * c;
		bdMulti = b * d;
		cdMulti = c * d;
		
		System.out.printf("\nResultado das Somas: \n"
				+ "> A + B = %.1f \n"
				+ "> A + C = %.1f \n"
				+ "> A + D = %.1f \n"
				+ "> B + C = %.1f \n"
				+ "> B + D = %.1f \n"
				+ "> C + D = %.1f \n", abSoma, acSoma, adSoma, bcSoma, bdSoma, cdSoma);
		
		System.out.printf("\nResultado das Multiplicações: \n"
				+ "> A * B = %.1f \n"
				+ "> A * C = %.1f \n"
				+ "> A * D = %.1f \n"
				+ "> B * C = %.1f \n"
				+ "> B * D = %.1f \n"
				+ "> C * D = %.1f \n", abMulti, acMulti, adMulti, bcMulti, bdMulti, cdMulti);
		sc.close();
	}

}

/*Faça um programa que leia quatro números e apresente os resultados de adição 
 * e multiplicação dos valores entre si, baseando-se na utilização da 
 * propriedade distributiva, ou seja, se forem lidas as variáveis A, B, C e D, 
 * devem ser somadas e multiplicadas A com B, A com C e A com D; B com C, B com 
 * D e por último C com D.
 */