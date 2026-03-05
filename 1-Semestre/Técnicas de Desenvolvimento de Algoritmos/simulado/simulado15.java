import java.util.Scanner;

public class simulado15 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.err.println("Digite o numwro que deseja saber a tabuada");
        int numero = leia.nextInt();

        int i = 0;

        while (i <= 10) {

            System.out.println(i * numero);

            i++;
        }

    }

}
