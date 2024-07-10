package funcaoTriangulo;

import java.util.Scanner;

public class FuncaoTriangulo {
	public static void verificarTriangulo(double ladoA, double ladoB, double ladoC) {

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
	}
	
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
		
		sc.close();
		
		verificarTriangulo(ladoA, ladoB, ladoC);
	}
}

/*Crie uma função que receba o comprimento de cada um dos três lados de um 
 * triângulo e retorne se esse triângulo é isósceles (dois lados iguais e 
 * um diferente), escaleno (todos os lados diferentes), equilátero (todos 
 * os lados são iguais) ou se não é um triangulo (algum lado é maior que 
 * a soma dos outros dois lados).
 */