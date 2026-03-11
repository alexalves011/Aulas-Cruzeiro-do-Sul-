import java.util.Scanner;

public class Contagem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Digite um numero para encontrar");
        int n = sc.nextInt();

        boolean achou = false;

        int passos = 1;

        for (int i = 0; i < v.length; i++) {
            if (n == v[i]) {
                achou = true;

                break;
            }

            passos++;
        }

        if (achou) {
            System.out.println("Elemento encontrado com " + passos + " passos");
        } else {
            System.out.println("Elemento não encontrado com " + passos + " passos");
        }

    }

}