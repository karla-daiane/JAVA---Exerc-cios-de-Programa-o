package consumomedio;
import java.util.Scanner;

public class CoonsumoMedio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a distância total percorrida (Km): ");
		double distancia = sc.nextDouble();
		System.out.println("Digite o total de combustível gasto (litros): ");
		double combustivel = sc.nextDouble();
		
		double consumo = distancia / combustivel;
		
		System.out.printf("\nO consumo médio do automóvel foi de: %.1f Km/l.\n", consumo);
		
		 sc.close();
	}
}

/*Faça um programa para determinar o consumo médio de um automóvel sendo 
 * fornecida a distância total percorrida pelo automóvel e o total de 
 * combustível gasto.
 */