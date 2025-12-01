import java.util.Scanner;

public class simulado20 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("digite o número que deseja saber a tabuada");
        int numero = leia.nextInt();

        int i = 1;

        do {

            i++;
            System.err.println(i * numero);

        } while (i <= 10);

    }

}
