import java.util.Scanner;

public class retangulo {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        double a, b, d; 
        double a1, a2, at; 

        System.out.println("Algoritimos para Calculo area retangulos");

        System.out.print("digite o valor da altura (a): ");
        a = leitor.nextDouble();

        System.out.print("digite o valor da base do retângulo superior (b): ");
        b = leitor.nextDouble();

        System.out.print("Por fim, digite o valor da base do retângulo inferior (d): ");
        d = leitor.nextDouble();

        a1 = a * b;
        a2 = a * d;
        at = a1 + a2;

        System.out.println("\n--- Resultados ---");
        System.out.println("A área do retângulo superior (A1) é: " + a1);
        System.out.println("A área do retângulo inferior (A2) é: " + a2);
        System.out.println("A área TOTAL (AT) das duas figuras é: " + at);
        
      
        leitor.close();


    }
}