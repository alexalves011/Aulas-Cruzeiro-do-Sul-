// É necessário importar a classe Scanner para que possamos ler a entrada do usuário.
import java.util.Scanner;

public class CadastroFuncionario {

    public static void main(String[] args) {
        
        // 1. Criação do objeto Scanner
        // Esta linha cria uma "ferramenta" chamada 'scanner' que fica pronta para ler
        // o que for digitado no teclado (System.in).
        Scanner scanner = new Scanner(System.in);

        // 2. Solicitação e Leitura dos Dados

        // Solicita o nome do funcionário
        System.out.print("Digite o nome do funcionário: ");
        // O método nextLine() lê a linha inteira de texto digitada pelo usuário.
        String nome = scanner.nextLine();

        // Solicita a quantidade de dependentes
        System.out.print("Digite a quantidade de dependentes: ");
        // O método nextInt() lê um número inteiro digitado pelo usuário.
        int quantidadeDependentes = scanner.nextInt();

        // **Atenção**: Após ler um número (nextInt), o "Enter" que o usuário pressiona
        // fica na memória de leitura (buffer). A linha abaixo consome esse "Enter"
        // para que a próxima leitura de texto (nextLine) funcione corretamente.
        scanner.nextLine(); 

        // Solicita o cargo do funcionário
        System.out.print("Digite o cargo ocupado: ");
        // Lê o cargo digitado.
        String cargo = scanner.nextLine();

        // 3. Exibição dos Dados
        // Agora, mostramos na tela as informações que foram armazenadas nas variáveis.
        
        System.out.println("\n--- DADOS DO FUNCIONÁRIO ---"); // \n cria uma linha em branco
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de Dependentes: " + quantidadeDependentes);
        System.out.println("Cargo: " + cargo);
        
        // 4. Fechamento do Scanner
        // É uma boa prática fechar o objeto Scanner para liberar os recursos do sistema.
        scanner.close();
    }
}