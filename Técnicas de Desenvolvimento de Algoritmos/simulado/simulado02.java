import java.util.Scanner;

public class simulado02 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o ano para verificar: ");
        int ano = leia.nextInt();

        // A Lógica:
        // (Divisível por 4 E não divisível por 100) OU (Divisível por 400)
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano Bissexto!");
        } else {
            System.out.println(ano + " não é Bissexto.");
        }
        
        leia.close();
    }
}