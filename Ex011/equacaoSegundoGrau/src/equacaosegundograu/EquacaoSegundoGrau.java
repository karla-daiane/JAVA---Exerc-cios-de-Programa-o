package equacaosegundograu;
import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double delta;
		double x;
		double x1;
		double x2;
		
		System.out.print("Informe o valor de 'A': ");
		a = sc.nextDouble();
		
		
		if (a != 0) {
			System.out.print("Informe o valor de 'B': ");
			b = sc.nextDouble();
			System.out.print("Informe o valor de 'C': ");
			c = sc.nextDouble();
			System.out.printf("\n    %.0fx² + %.0fx + %.0f\n", a, b, c);
			
			delta = (b * b) - 4 * a * c;
			
			if (delta < 0) {
				System.out.print("\n -> A equação não possui raízes reais. O valor de delta é negativo.");
			} else if (delta == 0) {
				x = -b / (2 * a);
				System.out.printf("\n -> Raiz real: \n    X = %.1f", x);
			} else {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("\n -> Raizes reais: \n    X1 = %.1f  \n    X2 = %.1f.", x1, x2);
			}
			
		} else {
			System.out.print("\n-> A equação do Segundo Grau não pode ter o valor de A igual a 0.");
		}
		
		sc.close();

	}

}

/*Faça um programa que calcule as raízes de uma equação do segundo grau, na 
 * forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer 
 * as consistências, informando ao usuário nas seguintes situações:

-> Se o usuário informar o valor de A igual a zero, a equação não é do segundo 
grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
-> Se o delta calculado for negativo, a equação não possui raizes reais. 
Informe ao usuário e encerre o programa;
-> Se o delta calculado for igual a zero a equação possui apenas uma raiz real; 
informe-a ao usuário;
-> Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário. 
*/