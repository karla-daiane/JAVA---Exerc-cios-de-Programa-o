package areacircunferencia;
import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;
        double area, raio, raio2;

        System.out.println("Digite o valor do Raio: ");
        raio = sc.nextDouble();
        raio2 = raio * raio;
        area = PI * raio2;
        System.out.printf("O Valor da Área da Circunferência é: %.2f. %n", area);
		 
        sc.close();
        }
    }

/*Faça um programa para calcular a área de uma circunferência, considerando a
 * fórmula AREA = π × RAIO2. Utilize as variáveis AREA e RAIO, a constante π
 * (pi = 3,14159) e os operadores aritméticos de multiplicação.*/