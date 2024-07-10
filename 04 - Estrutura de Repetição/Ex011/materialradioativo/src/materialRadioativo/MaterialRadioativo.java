package materialRadioativo;
import java.util.Scanner;

public class MaterialRadioativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double massaInicial;
		double massa;
		double tempo;
		
		System.out.println("Digite a massa do material radioativo (em gramas): ");
		massaInicial = sc.nextDouble();

		sc.close();
		
		massa = massaInicial;
		
		for (tempo = 0; massa > 0.05; tempo++) {
			massa *= 0.5;
		}
		
		tempo *= 50;
		
		System.out.printf("\nMassa inicial material radiotivo: %.3f gramas. \nTempo necessário: %.1f segundos.", massaInicial, tempo);		
		
	}

}

/*Um determinado material radioativo perde metade de sua massa a cada 
 * 50 segundos. Dada a massa inicial, em gramas, faça um programa que 
 * determine o tempo necessário para que essa massa se torne menor 
 * que 0,05 gramas.
 */