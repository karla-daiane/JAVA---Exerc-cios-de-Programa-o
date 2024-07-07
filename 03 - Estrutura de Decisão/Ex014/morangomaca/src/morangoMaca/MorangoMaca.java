package morangoMaca;

import java.util.Scanner;

public class MorangoMaca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double morango;
		double maca;
		double frutas;
		double valorMorango;
		double valorMaca;
		double valorTotal;
		double valorFinal;
		
		System.out.println("Quantos kilos de Morango: ");
		morango = sc.nextDouble();
		System.out.println("Quantos kilos de Maçã: ");
		maca = sc.nextDouble();
		
		valorMorango = morango > 5 ? morango * 2.20 : morango * 2.50;
		valorMaca = maca > 5 ? maca * 1.50 : maca * 1.80;
		
		frutas = morango + maca;
		valorTotal = valorMorango + valorMaca;
		
		valorFinal = valorTotal > 25 || frutas > 8 ? valorTotal * 0.9 : valorTotal;
		
		System.out.printf("\nValor total: R$ %.2f", valorFinal);
		
		sc.close();
	}

}

/*Uma quitanda está vendendo frutas com a seguinte tabela de preços. Se o 
 * cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
 * ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. 
 * Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a 
 * quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 *  _________________________________________
 * |			|Até 5Kg		|Acima de 5kg|
 * |Morango		|R$2,50 / kg	|R$2,20 / kg |
 * |Maçã		|R$1,80 / kg	|R$1,50 / kg |
*/