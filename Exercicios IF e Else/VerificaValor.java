import java.util.Scanner;

public class VerificaValor {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero: "); 
        int numero = leia.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.println("valor correto");
        } else {
            System.out.println("valor incorreto");
        }

        leia.close(); 
    }
}
