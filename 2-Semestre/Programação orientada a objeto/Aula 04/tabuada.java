import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n = ler.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }

    }

}
