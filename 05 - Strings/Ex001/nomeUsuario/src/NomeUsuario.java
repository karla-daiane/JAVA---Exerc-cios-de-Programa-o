import java.util.Scanner;

public class NomeUsuario {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nome;
    int i;

    System.out.println("> Digite seu nome: ");
    nome = sc.nextLine();

    i = nome.length() - 1;

    while (i >= 0) {
        System.out.println(nome.charAt(i));
        i--;
    }

    sc.close();
}
}

/*Faça um programa que permita ao usuário digitar o seu nome e em seguida 
*mostre o nome do usuário de trás para frente utilizando somente letras 
*maiúsculas.*/