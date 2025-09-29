import java.util.Scanner;

public class SelecionaEstagiario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor da bolsa: R$ ");
        double bolsa = leia.nextDouble();

        System.out.print("Digite o tempo de estágio (em anos): ");
        int tempo = leia.nextInt();

        if ((bolsa >= 750 && bolsa <= 950) && (tempo >= 2)) {
            System.out.println("Participará do treinamento");
        } else {
            System.out.println("Não participará");
        }

        leia.close();
    }
}
