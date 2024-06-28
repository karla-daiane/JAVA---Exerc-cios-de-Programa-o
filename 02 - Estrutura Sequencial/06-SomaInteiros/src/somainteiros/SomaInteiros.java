package somainteiros;

import java.util.Scanner;

public class SomaInteiros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro númmero inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo númmero inteiro: ");
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        
        System.out.printf("%d + %d = %d\n", n1, n2, soma);
		 
        sc.close();
    }
}

/*Faça um programa que:

- Leia um número inteiro;
- Leia um segundo número inteiro;
- Efetue a adição dos dois valores;
- Apresente o valor calculado.
*/