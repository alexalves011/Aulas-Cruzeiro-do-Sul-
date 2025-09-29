import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = leia.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = leia.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = leia.nextDouble();

        // Calcula delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("As raízes da equação são:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Delta não é positivo. Não existem raízes reais.");
        }

        leia.close();
    }
}
