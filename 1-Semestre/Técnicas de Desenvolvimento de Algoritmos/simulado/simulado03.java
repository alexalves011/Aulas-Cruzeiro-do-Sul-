
import java.util.Scanner;

public class simulado03 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = leia.nextInt();

        // 1. Se for maior que 0, é Positivo
        if (numero > 0) {
            System.out.println("O número " + numero + " é POSITIVO.");

            // 2. Se for menor que 0, é Negativo
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é NEGATIVO.");

            // 3. Se não é maior nem menor, só pode ser Zero
        } else {
            System.out.println("O número é ZERO (neutro).");
        }

        leia.close();
    }
}
