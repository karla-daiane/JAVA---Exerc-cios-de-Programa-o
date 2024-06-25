package horaextra;
import java.util.Scanner;

public class HoraExtra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horasTrabalhadas;
		double salarioHora;
		double salarioExtra;
		double salarioTotal;
		
		System.out.print("> Informe o número de horas trabalhas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.print("\n> Informe o valor do salário hora: R$ ");
		salarioHora = sc.nextDouble();
		
		if (horasTrabalhadas > 160) {
			salarioExtra = (horasTrabalhadas - 160) * (salarioHora * 1.50);
			salarioTotal = (160 * salarioHora) + salarioExtra;
		} else {
			salarioTotal = horasTrabalhadas * salarioHora;
		}
		
		System.out.printf("\n--> Salário total do funcionário: R$%.2f.", salarioTotal);
		
		sc.close();

	}

}

/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário 
 * que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor 
 * da hora regular com um acréscimo de 50%. Escreva um programa que leia o 
 * número de horas trabalhadas em um mês, o salário por hora e escreva o 
 * salário total do funcionário, que deverá ser acrescido das horas extras, 
 * caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
 */