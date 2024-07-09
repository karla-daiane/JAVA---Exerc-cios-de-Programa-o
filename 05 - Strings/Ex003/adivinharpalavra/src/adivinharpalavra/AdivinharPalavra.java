package adivinharpalavra;
import java.util.Scanner;
import java.util.Random;

public class AdivinharPalavra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String[] palavras = {"árvore", "mesa", "livro", "telefone", "computador", 
				"escola", "janela", "cadeira", "praia", "cidade", "relógio", 
				"bicicleta", "jardim", "estrada", "montanha"};
		
		String palavraEmbaralhada;
		String palavra;
		int indice;
		String chute;
		
		
		palavra = palavras[random.nextInt(palavras.length)];
		char[] letras = palavra.toCharArray();
		
		for (int i = 0; i < palavra.length(); i++) {
			indice = random.nextInt(palavra.length());
			char temp = letras[i];
			letras[i] = letras[indice];
			letras[indice] = temp;
		}
		
		palavraEmbaralhada = new String(letras);
		
		System.out.printf("A palavra é: %s", palavraEmbaralhada);
		for (int tent = 1; tent <= 6; tent++) {
			String palavraTentativa = tent > 1 ? "tentativas" : "tentativa";
			System.out.printf("\n>Tente adivinhar a palavra em até 6 tentativas. "
					+ "\n> Está é a sua %dª tentativa:\n", tent);
			chute = sc.nextLine();
			
			if (palavra.equalsIgnoreCase(chute)) {
				System.out.printf("\nParabéns você acertou a palavra \"%s\" com %d %s.", 
						palavra, tent, palavraTentativa);
				break;
			} else if (tent == 6) {
				System.out.printf("\nQue pena, suas tentativas acabaram! \n> A palavra era %s.", 
						palavra);
			} else {
				System.out.println("\nVocê errou! Tente novamente.");
			}
		}
		
		sc.close();
	}

}

/*Desenvolva um jogo em que o usuário tenha que adivinhar uma palavra que será 
 * mostrada com as letras embaralhadas. O programa terá uma lista de palavras 
 * lidas de um arquivo texto ou de um vetor e será escolhida uma aleatoriamente. 
 * O jogador terá seis tentativas para adivinhar a palavra. Ao final a palavra 
 * deve ser mostrada na tela, informando se o usuário ganhou ou perdeu o jogo.
 */