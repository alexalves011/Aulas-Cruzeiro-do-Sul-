import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada dos dois números
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else {
            int resto = num1 % num2; // Calcula o resto da divisão
            System.out.println("O resto da divisão de " + num1 + " por " + num2 + " é: " + resto);
        }

        sc.close();
    }
}

