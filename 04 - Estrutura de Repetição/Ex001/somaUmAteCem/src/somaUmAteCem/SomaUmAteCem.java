package somaUmAteCem;

public class SomaUmAteCem {

	public static void main(String[] args) {
		
		int numero = 1;
		int soma = 0;
		
		while (numero <= 100) {
			soma += numero;
			numero++;
		}
		
		System.out.printf("> Soma dos números inteiros de 1 à 100: %d", soma);
	}

}

/*Faça um programa que calcule a soma dos números inteiros de 1 a 100.*/