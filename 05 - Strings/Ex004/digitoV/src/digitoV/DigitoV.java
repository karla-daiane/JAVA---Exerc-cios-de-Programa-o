package digitoV;
import java.util.Scanner;

public class DigitoV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String codigo;
		int digitoV;
		int s;
		
		System.out.println("Digite o código de 5 algarismos: ");
		codigo = sc.nextLine();
		
		s = 6 * Character.getNumericValue(codigo.charAt(0)) + 5 * Character.getNumericValue(codigo.charAt(1)) 
		+ 4 * Character.getNumericValue(codigo.charAt(2)) + 3 * Character.getNumericValue(codigo.charAt(3))
		+ 2 * Character.getNumericValue(codigo.charAt(4));
		
		digitoV = s % 7;
		
		System.out.printf("\nCódigo: %s\nO dígito verificador (módulo 7): %d", codigo, digitoV);
		
		sc.close();
	}

}

/*Leia um código de cinco algarismos (variável Codigo) e gere o digito 
 * verificador (DigitoV) módulo 7 para o mesmo. Supondo que os cinco 
 * algarismos do código são ABCDE, uma forma de calcular o dígito desejado, 
 * com módulo 7 é: 
 * DigitoV = resto da divisão de S por 7, onde S = 6A + 5B + 4C + 3D + 2E
*/