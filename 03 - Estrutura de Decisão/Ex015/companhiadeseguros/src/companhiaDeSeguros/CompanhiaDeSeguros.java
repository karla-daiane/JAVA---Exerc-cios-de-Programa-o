package companhiaDeSeguros;
import java.util.Scanner;

public class CompanhiaDeSeguros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int grupo;
		int idade;
		int categoria;
		
		System.out.println("Digite o nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		
		System.out.println("Digite o número do grupo de risco. \n1 - Baixo | 2 - Médio | 3 - Alto: \n");
		grupo = sc.nextInt();
		
		System.out.println("\n");
		System.out.println("___________________________________________________________________________");
		System.out.printf("\nNome: %s \nIdade: %d", nome, idade);

		
		if ( idade >= 17 & idade <= 70) {
			if (idade >= 17 & idade <= 20) {
				categoria = grupo;
				System.out.printf("\n> Categoria: %d", categoria);
			} else if (idade >= 21 & idade <= 24) {
				categoria = grupo + 1;
				System.out.printf("\n> Categoria: %d", categoria);
			} else if (idade >= 25 & idade <= 34) {
				categoria = grupo + 2;
				System.out.printf("\n> Categoria: %d", categoria);
			} else if (idade >= 35 & idade <= 64) {
				categoria = grupo + 3;
				System.out.printf("\n> Categoria: %d", categoria);
			} else if (idade >= 65 & idade <= 70) {
				categoria = grupo + 6;
				System.out.printf("\n> Categoria: %d", categoria);
			}
		} else {
			System.out.println("\n> A faixa etária informada não pode adquirir apólices de seguro.");
		}
		
		sc.close();
	}

}

/*Uma Companhia de Seguros possui nove categorias de seguro baseadas na idade 
 * e ocupação do segurado. Somente pessoas com pelo menos 17 anos e não mais 
 * de 70 anos podem adquirir apólices de seguro. Quanto às classes de 
 * ocupações, foram definidos três grupos de risco. A tabela abaixo fornece as 
 * categorias em função da faixa etária e do grupo de risco. Dados nome, idade 
 * e grupo de risco, determinar a categoria do pretendente à aquisição de tal 
 * seguro. Imprimir o nome a idade e a categoria do pretendente, e, caso a 
 * idade não esteja na faixa necessária, imprimir uma mensagem.

Idades	|Grupos de risco
 		|Baixa	|Média	|Alta
17 a 20	|1		|2		|3
21 a 24	|2		|3		|4
25 a 34	|3		|4		|5
35 a 64	|4		|5		|6
65 a 70	|7		|8		|9
*/