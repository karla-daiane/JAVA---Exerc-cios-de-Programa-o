package descontoCombustivel;
import java.util.Scanner;

public class DescontoCombustivel {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        double qtdLitros;
        char combustivel;
        double total;
        double desconto = 0;
        double valor = 0;
        boolean validador = false;
        final double V_G = 3.3;
        final double V_A = 2.9;
        System.out.print("Quantos litros? ");
        qtdLitros = ler.nextDouble();
        do {
            System.out.print("Qual combustível? Álcool (A) ou Gasolina (G): ");
            combustivel = ler.next().charAt(0);
            switch (combustivel) {
                case 'A':
                case 'a':
                    desconto = qtdLitros <= 20 ? 0.03 : 0.05;
                    validador = false;
                    valor = V_A;
                    break;
                case 'G':
                case 'g':
                    desconto = qtdLitros <= 20 ? 0.04 : 0.06;
                    validador = false;
                    valor = V_G;
                    break;
                default:
                    System.out.println("Valor inválido! ");
                    validador = true;
                    break;
            }
        } while(validador);
        total = qtdLitros * valor * (1 - desconto);
        System.out.printf("Total: R$ %.2f", total);
        ler.close();
	}

}


/*
 * Um posto está vendendo combustíveis com a seguinte tabela de descontos.
 * Escreva um programa que leia o número de litros vendidos e o tipo de 
 * combustível (codificado da seguinte forma: A-álcool, G-gasolina)
 * calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço
 * do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
 */
