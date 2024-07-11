package funcaoConverterTemperatura;
import java.util.Scanner;

public class FuncaoConverterTemperatura {
	public static double converterFahrenheitCelsius(double fahrenheit) {
		double celsius;
		celsius = (fahrenheit - 32) / 1.8;
		return celsius;
	}
	
	public static double converterCelsiusFahrenheit(double celsius) {
		double fahrenheit;
		fahrenheit = celsius * 1.8 + 32;
		return fahrenheit;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double temperatura;
		double conversao;
		char escolhaTemperatura;
		
		System.out.println("Escolha a temperatura que deseja converter: \n"
				+ "> F - Fahrenheit para celsius \n> C - celsius para Fahrenheit");
		escolhaTemperatura = sc.next().charAt(0);
		
		
		switch (escolhaTemperatura) {
		case 'f':
		case 'F':
			System.out.println("\nDigite a temperatura em °F: ");
			temperatura = sc.nextDouble();
			conversao = converterFahrenheitCelsius(temperatura);
			System.out.printf("\n> Conversão: %.0f°F <-----> %.0f°C", temperatura, conversao);
			break;
		case 'c':
		case 'C':
			System.out.println("\nDigite a temperatura em °C: ");
			temperatura = sc.nextDouble();
			conversao = converterCelsiusFahrenheit(temperatura);
			System.out.printf("\n> Conversão: %.0f°C <-----> %.0f°F", temperatura, conversao);
			break;
		default:
			System.out.println("\n! A temperatura escolhida é inválida.");
			break;
		}		
		
		sc.close();
	}
}

/*Faça um programa com duas funções, uma que recebe uma temperatura em 
 * Fahrenheit e retorna em celsius e outra que faz o inverso. Lembrando 
 * que as fórmulas são ℃ = (℉ - 32) ÷ 1,8 e ℉ = ℃ × 1,8 + 32.
 */
