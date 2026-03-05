import java.util.Scanner;

public class ClasseEleitoral {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = leia.nextInt();

        if (idade < 16) {
            System.out.println("Não-eleitor");
        } else if ((idade >= 16 && idade < 18) || (idade > 65)) {
            System.out.println("Eleitor facultativo");
        } else {
            System.out.println("Eleitor obrigatório");
        }

        leia.close();
    }
}
