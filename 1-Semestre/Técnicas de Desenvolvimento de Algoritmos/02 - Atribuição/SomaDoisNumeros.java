
import java.util.Scanner;

public class SomaDoisNumeros {

    public static void main(String[] args) {

      
        Scanner leitor = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = leitor.nextInt();

       
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = leitor.nextInt();

        
        int soma = numero1 + numero2;

        
        System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + soma);

       
        leitor.close();
    }
}