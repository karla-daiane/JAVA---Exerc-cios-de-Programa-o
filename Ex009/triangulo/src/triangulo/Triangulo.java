package triangulo;
import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double ladoA;
		double ladoB;
		double ladoC;
		
		System.out.print("> Informe o valor do lado A do triângulo: ");
		ladoA = sc.nextDouble();
		System.out.print("> Informe o valor do lado B do triângulo: ");
		ladoB = sc.nextDouble();
		System.out.print("> Informe o valor do lado C do triângulo: ");
		ladoC = sc.nextDouble();
		
		if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
			if (ladoA == ladoB && ladoA == ladoC) {
				System.out.print("\n--> Os valores informados formam um triângulo Equilátero.");
			} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
				System.out.print("\n--> Os valores informados formam um triângulo Isósceles.");
			} else {
				System.out.print("\n--> Os valores informados formam um triângulo Escaleno.");
			}
		} else {
			System.out.print("\n--> Os valores informados não formam um triângulo.");
		}
		
		sc.close();
	}
}

/*Faça um programa que efetue a leitura de três valores numéricos representando 
 * os lados de um triângulo. O programa deverá verificar e informar se os lados 
 * fornecidos formam realmente um triângulo (cada lado é menor que a soma dos 
 * outros dois lados). Se esta condição for verdadeira, deverá ser indicado 
 * qual tipo de triângulo foi formado: isósceles (dois lados iguais e um 
 * diferente), escaleno (todos os lados diferentes) ou eqüilátero (todos os 
 * lados são iguais).*/