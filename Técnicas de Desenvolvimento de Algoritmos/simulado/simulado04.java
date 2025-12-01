
import java.util.Scanner;

public class simulado04 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("digite sua nota");
        int nota = leia.nextInt();

        if (nota < 7) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }
}