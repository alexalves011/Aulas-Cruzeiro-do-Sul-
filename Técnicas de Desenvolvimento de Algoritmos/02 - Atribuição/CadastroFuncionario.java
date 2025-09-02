
import java.util.Scanner;

public class CadastroFuncionario {

    public static void main(String[] args) {
        
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
      
        String nome = scanner.nextLine();

        
        System.out.print("Digite a quantidade de dependentes: ");
        
        int quantidadeDependentes = scanner.nextInt();

     
        scanner.nextLine(); 

       
        System.out.print("Digite o cargo ocupado: ");
      
        String cargo = scanner.nextLine();

        
        
        System.out.println("\n--- DADOS DO FUNCIONÁRIO ---"); 
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de Dependentes: " + quantidadeDependentes);
        System.out.println("Cargo: " + cargo);
        

        scanner.close();
    }
}