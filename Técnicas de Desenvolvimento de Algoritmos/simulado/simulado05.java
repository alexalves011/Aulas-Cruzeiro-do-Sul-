import java.util.Scanner;

public class simulado05 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = leia.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = leia.nextInt();

        // 1. Verifica se o primeiro é maior
        if (num1 > num2) {
            System.out.println("O primeiro número (" + num1 + ") é MAIOR que o segundo.");
        
        // 2. Se não for maior, verifica se é menor
        } else if (num1 < num2) {
            System.out.println("O primeiro número (" + num1 + ") é MENOR que o segundo.");
        
        // 3. Se não é maior nem menor, eles são iguais
        } else {
            System.out.println("Os números são IGUAIS.");
        }
        
        leia.close();
    }
}