import java.util.Scanner;
public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, nota3, nota4, media;
        System.out.println("Insira a 1ª Nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Insira a 2ª Nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Insira a 3ª Nota: ");
        nota3 = sc.nextDouble();
        System.out.println("Insira a 4ª Nota: ");
        nota4 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.printf("A média das notas é: %.2f %n", media);

        sc.close();
}
    
}