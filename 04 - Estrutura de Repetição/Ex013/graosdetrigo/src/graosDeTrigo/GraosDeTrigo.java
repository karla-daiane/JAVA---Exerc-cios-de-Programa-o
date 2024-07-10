package graosDeTrigo;

import java.math.BigInteger;

public class GraosDeTrigo {

	public static void main(String[] args) {
		BigInteger graos = BigInteger.ONE;
		
		for (int i = 1; i <= 64; i++) {
			graos = graos.multiply(BigInteger.valueOf(2));
		}
		
		System.out.printf("Total de grãos de trigo: %d.", graos);

	}

}

/*Uma rainha requisitou os serviços de um monge e disse-lhe que pagaria 
 * qualquer preço. O monge, necessitando de alimentos, indagou à rainha 
 * sobre o pagamento, se poderia ser feito com grãos de trigo dispostos 
 * em um tabuleiro de xadrez (que possui 64 casas), de tal forma que o 
 * primeiro quadro deveria conter apenas um grão e os quadros subsequentes, 
 * o dobro do quadro anterior. Crie um programa para calcular o total de 
 * grãos que o monge recebeu.
 */