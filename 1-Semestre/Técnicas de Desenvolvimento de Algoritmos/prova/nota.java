import java.util.Scanner;

public class nota {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int media; // A média será um inteiro

        System.out.println("Nota Final");

        System.out.println("Digite sua Primeira Nota");
        n1 = leitor.nextInt();
        System.out.println("Digite sua segunda Nota");
        n2 = leitor.nextInt();
        System.out.println("Digite sua terceira Nota");
        n3 = leitor.nextInt();

        // CORREÇÃO 1: Calcular a média DEPOIS de ler as notas
        media = (n1 + n2 + n3) / 3;

        System.out.println("Sua média (inteira) é: " + media);

        if (media < 4) {
            System.out.println("Reprovado");
        } else if (media >= 4 && media < 6) { // CORREÇÃO 2: Sintaxe correta
            System.out.println("Recuperação");
        } else { // CORREÇÃO 3: 'else' não tem condição
            System.out.println("Aprovado");
        }

    }
}
