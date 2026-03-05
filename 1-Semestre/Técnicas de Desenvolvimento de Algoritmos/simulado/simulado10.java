
import java.util.Scanner;

public class simulado10 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o Número que quer saber a tabuada");
        int numero = leia.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(i * numero);

        }

    }

}
