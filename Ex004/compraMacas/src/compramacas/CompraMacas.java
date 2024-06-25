package compramacas;
import java.util.Scanner;

public class CompraMacas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdMacas;
		double totalCompra = 0;
		
		System.out.print("Digite a quantidade de maçãs: ");
		qtdMacas = sc.nextInt();
		
		if (qtdMacas >= 0) {
			if (qtdMacas < 12) {
				totalCompra = qtdMacas * 1.30;
			} else {
				totalCompra = qtdMacas * 1.00;
			}
			System.out.printf("O valor total de %d Maçãs é: R$ %.2f.", qtdMacas, totalCompra);
		} else {
			System.out.println("A quantidade inserida é inválida.");
		}
		
		sc.close();
	}

}

/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e 
 * R$ 1,00 se forem compradas pelo menos 12 unidades. Escreva um programa 
 * que leia o número de maçãs compradas, calcule e escreva o custo total 
 * da compra.*/