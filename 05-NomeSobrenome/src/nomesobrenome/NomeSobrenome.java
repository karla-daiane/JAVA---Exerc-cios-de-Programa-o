package nomesobrenome;

import java.util.Scanner;

public class NomeSobrenome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("\nDigite o seu Sobrenome: ");
        String sobrenome = sc.nextLine();
        
        System.out.printf("\nO nome informado foi: \n%s %s \n", nome, sobrenome);
		 
        sc.close();
    }
}

/*Faça um programa que:

- Leia o nome;
- Leia o sobrenome;
- Concatene o nome com o sobrenome;
- Apresente o nome completo.*/