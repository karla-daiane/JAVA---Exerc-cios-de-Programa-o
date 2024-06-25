package baseexpoente;

import java.util.Scanner;

public class BaseExpoente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor da base: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o valor do expoente: ");
        double n2 = sc.nextDouble();
        
        double res = Math.pow(n1, n2);
        System.out.printf("A potência de %.1f elevado a %.1f é: %.1f. %n", n1, n2, res);
		 
        sc.close();
    }
}

/*Faça um programa que peça dois números, base e expoente, calcule e mostre o 
primeiro número elevado ao segundo número. Utilize a função de potência da 
linguagem.*/