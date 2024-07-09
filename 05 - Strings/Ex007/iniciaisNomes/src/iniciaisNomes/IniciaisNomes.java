package iniciaisNomes;

import java.util.Scanner;

public class IniciaisNomes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite o nome: ");
		nome = sc.nextLine();
		nome = nome.trim();
		
		String nomeSeparado[] = nome.split("\\s+");
		
		System.out.print("\nIniciais: ");
		for (String n : nomeSeparado) {
			if (!n.equalsIgnoreCase("e") & !n.equalsIgnoreCase("do") 
					& !n.equalsIgnoreCase("da") & !n.equalsIgnoreCase("de") 
					& !n.equalsIgnoreCase("di") & !n.equalsIgnoreCase("du") 
					& !n.equalsIgnoreCase("das") & !n.equalsIgnoreCase("dos")) 
			{
				System.out.print(n.toUpperCase().charAt(0));
			}
		}
		
		sc.close();
	}

}

/*Escreva um programa que, a partir de um nome informado pelo usuário, 
 * exiba suas iniciais. As iniciais são formadas pela primeira letra 
 * de cada nome, sendo que todas deverão aparecer em maiúsculas na saída 
 * do programa. Note que os conectores e, do, da, dos, das, de, di, du não 
 * são considerados nomes e, portanto, não devem ser considerados para a 
 * obtenção das iniciais. As iniciais devem ser impressas em maiúsculas, 
 * ainda que o nome seja entrado todo em minúsculas.
 *
 * Exemplos: 
 * Maria das Graças Pimenta => MGP 
 * João Carlos dos Santos => JCS
 */