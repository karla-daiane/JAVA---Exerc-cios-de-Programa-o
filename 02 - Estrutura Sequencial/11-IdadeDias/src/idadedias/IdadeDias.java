package idadedias;
import java.util.Scanner;

public class IdadeDias {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Preencha sua idade em Anos, Meses e Dias: ");
		System.out.println("Quantos ANOS você tem? ");
		int anos = sc.nextInt();
		System.out.println("Quantos MESES você tem? ");
		int meses = sc.nextInt();
		System.out.println("Quantos DIAS você tem? ");
		int dias = sc.nextInt();
		
		int idadeDias = (anos * 365) + (meses * 30) + dias;
		System.out.printf("Você já viveu %d dias.", idadeDias);
		sc.close();
	}
}

/*Faça um programa que leia a idade de uma pessoa expressa em anos, meses e 
 * dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar 
 * ano com 365 dias e mês com 30 dias. Calcular quantos dias a pessoa já 
 * viveu até hoje.
 */