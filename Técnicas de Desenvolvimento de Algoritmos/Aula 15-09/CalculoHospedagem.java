import java.util.Locale;
import java.util.Scanner;

public class CalculoHospedagem {

    public static void main(String[] args) {
       
        Locale.setDefault(new Locale("pt", "BR"));

       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o tipo da diária (S - Simples, D - Duplo, T - Triplo): ");
        
        char tipoDiaria = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de diárias: ");
        int quantidadeDiarias = scanner.nextInt();

        
        double valorTotal = 0.0;

        
        
        if (tipoDiaria == 'S') {
            
            valorTotal = 255.50 * quantidadeDiarias;
            System.out.printf("O valor total a pagar é: R$ %.2f\n", valorTotal);
        } else {
            
            if (tipoDiaria == 'D') {
                valorTotal = 305.50 * quantidadeDiarias;
                System.out.printf("O valor total a pagar é: R$ %.2f\n", valorTotal);
            } else {
                
                if (tipoDiaria == 'T') {
                    valorTotal = 360.50 * quantidadeDiarias;
                    System.out.printf("O valor total a pagar é: R$ %.2f\n", valorTotal);
                } else {
                    
                    System.out.println("Tipo de diária inválido");
                }
            }
        }

        
        scanner.close();
    }
}