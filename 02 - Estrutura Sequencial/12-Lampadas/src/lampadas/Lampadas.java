package lampadas;
import java.util.Scanner;

public class Lampadas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double potenciaLampada;
		double larguraComodo;
		double comprimentoComodo;
		double areaComodo;
		double qtdLampadas18w;
		int totalLampadas;
		
		System.out.println("Digite a potência das lâmpadas: ");
		potenciaLampada = sc.nextDouble();
		System.out.println("Digite a largura do cômodo: ");
		larguraComodo = sc.nextDouble();
		System.out.println("Digite o comprimento do cômodo: ");
		comprimentoComodo = sc.nextDouble();
		
		areaComodo = larguraComodo * comprimentoComodo;
		qtdLampadas18w = areaComodo * 18;
		totalLampadas = (int)Math.ceil(qtdLampadas18w / potenciaLampada);
		
		System.out.printf("A quantidade de Lâmpadas %.0f watts para %.1fm² é de: "
				+ "%d", potenciaLampada, areaComodo, totalLampadas);
		sc.close();
		}
}

/*Faça um programa para calcular e imprimir o número de lâmpadas necessárias 
 * para iluminar um determinado cômodo de uma residência. Dados de entrada: 
 * a potência da lâmpada utilizada (em watts), as dimensões (largura e 
 * comprimento, em metros) do cômodo. Considere que a potência necessária é 
 * de 18 watts por metro quadrado.
 */