
import java.util.Scanner;


public class ConversorDolar {
    
public static void main(String[] args) {
    
    Scanner Leitor = new Scanner(System.in);

    double cotacaoDolar;
    double valorDolar;
    double valorReal;

     System.out.println("Conversor de Dólar para Real");

     System.out.println("Digite a Cotação atual do dólar");
     cotacaoDolar = Leitor.nextDouble();

     System.out.println("Digite o Valor que deseja converte");
     valorDolar = Leitor.nextDouble();

     valorReal = cotacaoDolar * valorDolar;

      System.out.printf("\nO valor equivalente em Reais (R$) é: R$ %.2f", valorReal);

        // Fecha o leitor para liberar recursos do sistema.
        Leitor.close();
}

}
