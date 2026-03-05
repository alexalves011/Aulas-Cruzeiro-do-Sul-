import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {

    public static void main(String[] args) {

     
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       
        int numeroMinimo = 1;
        int numeroMaximo = 100;
        int numeroSecreto = random.nextInt(numeroMaximo - numeroMinimo + 1) + numeroMinimo;

       
        int palpiteDoUsuario = 0;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("--- Bem-vindo ao Jogo Adivinhe o Número! ---");
        System.out.println("Eu sorteei um número entre " + numeroMinimo + " e " + numeroMaximo + ".");
        System.out.println("Tente adivinhar qual é!");
        System.out.println("----------------------------------------------");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            
            try {
                palpiteDoUsuario = scanner.nextInt();
                tentativas++; 

                // 6. Compara o palpite com o número secreto
                if (palpiteDoUsuario < numeroSecreto) {
                    System.out.println("Muito baixo! Tente um número maior.");
                } else if (palpiteDoUsuario > numeroSecreto) {
                    System.out.println("Muito alto! Tente um número menor.");
                } else {
            
                    acertou = true;
                    System.out.println("\n🎉 Parabéns! Você acertou!");
                    System.out.println("O número secreto era: " + numeroSecreto);
                    System.out.println("Você precisou de " + tentativas + " tentativas.");
                }

            } catch (java.util.InputMismatchException e) {
                // 7. Trata o caso do usuário não digitar um número
                System.out.println("Ops! Isso não é um número válido. Tente novamente.");
                scanner.next(); // Limpa o buffer do scanner para evitar um loop infinito
            }
        }

        // 8. Fecha o scanner ao final do jogo
        scanner.close();
    }
}