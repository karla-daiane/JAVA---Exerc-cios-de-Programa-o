package combustivelgasto;

import java.util.Scanner;

public class CombustivelGasto {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o tempo gasto na viagem (horas): ");
		double tempo = sc.nextDouble();
		System.out.println("Insira a Velocidade média em Km/h: ");
		double velocidade = sc.nextDouble();
		
		double distancia = tempo * velocidade;
		double litrosGastos = distancia / 12;
		
		System.out.printf("\nVelocidade Média: %.0f Km/h \n"
				+ "Tempo Gasto: %.0f h \n"
				+ "A distância percorrida foi: %.0f Km \n"
				+ "Combustível Usado: %.1f litros.",velocidade, tempo, distancia, litrosGastos);
		 
        sc.close();
	}
}

/*Faça um programa que calcule a quantidade de litros de combustível gasta em 
 * uma viagem, utilizando um automóvel que faz 12Km por litro. Para obter o 
 * cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade 
 * média durante ela. Desta forma, será possível obter a distância percorrida 
 * com a fórmula DISTANCIA = TEMPO × VELOCIDADE. Tendo o valor da distância, 
 * basta calcular a quantidade de litros de combustível utilizada na viagem 
 * com a fórmula: LITROS_USADOS = DISTANCIA ÷ 12. O programa deve apresentar 
 * os valores da velocidade média, tempo gasto na viagem, a distância 
 * percorrida e a quantidade de litros utilizada na viagem.*/