import java.util.Scanner;

public class QuantidadeVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase;
        //int i = 0;
        char letra;
        int espaco = 0;
        int vogalA = 0;
        int vogalE = 0;
        int vogalI = 0;
        int vogalO = 0;
        int vogalU = 0;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine().toUpperCase();
        
        for (int i = 0; i < frase.length(); i++) {
        	letra = frase.charAt(i);
            
            switch (letra) {
            case ' ':
            	espaco++;
            	break;
            case 'A':
            	vogalA++;
            	break;
            case 'E':
            	vogalE++;
            	break;
            case 'I':
            	vogalI++;
            	break;
            case 'O':
            	vogalO++;
            	break;
            case 'U':
            	vogalU++;
            	break;
            default:
            	break;
            }
        }

        /*while (i <= frase.length() - 1) {
           if (frase.charAt(i) == ' ') {
            espaco++;
           } else if (frase.charAt(i) == 'A') {
            vogalA++;
           } else if (frase.charAt(i) == 'E') {
            vogalE++;
           } else if (frase.charAt(i) == 'I') {
            vogalI++;
           } else if (frase.charAt(i) == 'O') {
            vogalO++;
           } else if (frase.charAt(i) == 'U') {
            vogalU++;
           }
           i++;
        }*/

        System.out.printf("> Na frase há: \n-> %d espaços em branco;" + 
        " \n-> %d Letra(s) A;" + 
        " \n-> %d Letra(s) E;" + 
        " \n-> %d Letra(s) I;" + 
        " \n-> %d Letra(s) O;" + 
        " \n-> %d Letra(s) U;", espaco, vogalA, vogalE, vogalI, vogalO, vogalU);

        sc.close();
    }
}
