package comissaocorretor;
import java.util.Scanner;

public class ComissaoCorretor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double valorVenda;
		double valorComissao;
		
		System.out.println("Digite o nome do corretor: ");
		nome = sc.nextLine();
		System.out.print("\nDigite o valor da venda: R$ ");
		valorVenda = sc.nextDouble();
		
		if (valorVenda > 50000) {
			valorComissao = valorVenda * 0.12;		
		} else if (valorVenda < 30000) {
			valorComissao = valorVenda * 0.07;
		} else {
			valorComissao = valorVenda * 0.095;
		}
		
		System.out.printf("\nO valor da comissão da venda de R$%.2f, do corretor(a) %s é de: R$%.2f.", valorVenda, nome, valorComissao);
		
		sc.close();
	}

}

/*A empresa paga ao corretor uma comissão calculada de acordo com o valor de 
 * suas vendas. Se o valor da venda de um corretor for maior que R$ 50.000,00 
 * a comissão será de 12% do valor vendido. Se o valor da venda do corretor 
 * estiver entre R$ 30.000,00 e R$ 50.000,00 (incluindo extremos) a comissão 
 * será de 9,5%. Em qualquer outro caso, a comissão será de 7%. Escreva um 
 * programa onde será informado nome do corretor e o valor da venda, após isto 
 * o programa irá calcular o valor da comissão.*/