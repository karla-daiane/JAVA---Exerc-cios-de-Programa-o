package populacaoPais;

public class PopulacaoPais {

	public static void main(String[] args) {
		int paisA = 80000;
		double crescimentoA = 1.03;
		int paisB = 200000;
		double crescimentoB = 1.015;
		int tempo;
		
		double populacaoA = paisA;
		double populacaoB = paisB;
		
		for (tempo = 0; populacaoA < populacaoB; tempo++) {
			populacaoA *= crescimentoA;
			populacaoB *= crescimentoB;
		}
		
		
		System.out.printf("> Levou %d anos para a população do país A ultrapassar o pais B.", tempo);
	}

}

/*Supondo que a população de um país A seja da ordem de 80.000 habitantes com 
 * uma taxa anual de crescimento de 3% e que a população de B seja 200.000 
 * habitantes com uma taxa de crescimento de 1,5%. Faça um programa que 
 * calcule e escreva o número de anos necessários para que a população do país 
 * A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
 */