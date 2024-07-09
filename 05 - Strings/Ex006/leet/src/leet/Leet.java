package leet;

import java.util.Scanner;

public class Leet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto;
		String leet;
		
		System.out.println("Digite o texto que será traduzido para leet speak: ");
		texto = sc.nextLine().toLowerCase();
		
		leet = texto.replace('e', '3').replace('o', '0').replace('i', '1').replace('l', '1').replace('s', '5').replace('t', '7');
		
		System.out.printf("\n> Texto Original: \n%s \n\n> Tradução Leet Speak: \n%s", texto, leet);
		
		sc.close();
	}

}

/*Leet é uma forma de se escrever o alfabeto latino usando outros símbolos em 
 * lugar das letras, como números por exemplo. A própria palavra leet admite 
 * muitas variações, como l33t ou 1337. O uso do leet reflete uma subcultura 
 * relacionada ao mundo dos jogos de computador e internet, sendo muito usada 
 * para confundir os iniciantes e afirmar-se como parte de um grupo. Pesquise 
 * sobre as principais formas de traduzir as letras. Depois, faça um programa 
 * que peça uma texto e transforme-o para a grafia leet speak.
 * 
 * In its most basic version, the leet replaces at least 
 * the letter E by the number 3, 
 * the letter O by the number 0, 
 * the letters I and L by the number 1, 
 * the letter S by the number 5 and 
 * the letter T by the number 7.
 */