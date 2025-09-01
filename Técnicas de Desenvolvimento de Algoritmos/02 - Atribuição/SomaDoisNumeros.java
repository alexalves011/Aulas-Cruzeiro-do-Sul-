// É preciso importar a classe Scanner para ler dados do teclado.
import java.util.Scanner;

public class SomaDoisNumeros {

    public static void main(String[] args) {

        // 1. Preparação: Cria um objeto Scanner para ler a entrada do usuário.
        Scanner leitor = new Scanner(System.in);

        // 2. Entrada: Pede e lê o primeiro número.
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = leitor.nextInt();

        // 3. Entrada: Pede e lê o segundo número.
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = leitor.nextInt();

        // 4. Processamento: Calcula a soma dos dois números.
        int soma = numero1 + numero2;

        // 5. Saída: Exibe o resultado da soma na tela.
        System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + soma);

        // 6. Finalização: Fecha o leitor para liberar recursos.
        leitor.close();
    }
}