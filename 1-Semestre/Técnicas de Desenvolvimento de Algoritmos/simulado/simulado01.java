import java.util.Scanner;

public class simulado01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = leia.nextInt();

        if (num % 2 == 0) {
            System.out.println("seu número é par");
        } else {
            System.out.println("seu numero é impar");
        }

    }

}