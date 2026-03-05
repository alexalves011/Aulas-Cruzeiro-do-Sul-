import java.util.Scanner;

public class maiorElemento {

    public static void main(String[] args) {

        int[] numero = new int[8];
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < numero.length; i++) {
            System.out.println("digite um número");
            numero[1] = leia.nextInt();
        }

        int maior = numero[0];
        for (int i = 1; i < numero.length; i++) {
            if (numero[i] > maior) {
                maior = numero[i];
            }
        }

        System.out.println(" O Maior número informado foi " + maior);

    }

}
