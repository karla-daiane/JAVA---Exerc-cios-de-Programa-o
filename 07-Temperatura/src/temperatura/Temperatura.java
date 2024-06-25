package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em °C: ");
        int celsius = sc.nextInt();
        
        double fahrenheit = (9 * celsius + 160)/5;
        
        System.out.printf("A temperatura em Fahrenheit é: %.0f°F. \n", fahrenheit);
		 
        sc.close();
    }
}

/*Faça um programa que leia uma temperatura em graus Celsius e apresente-a 
convertida em graus Fahrenheit. A fórmula de conversão é: ℉ = (9 × ℃ + 160) 
÷ 5, na qual ℉ é a temperatura em Fahrenheit e ℃ é a temperatura em Celsius.
*/