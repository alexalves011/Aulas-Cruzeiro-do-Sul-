import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

       
        if (a == 0) {
            System.out.println("Não é uma equação de 2º grau, pois a = 0.");
        } else {
            
            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {
              
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("As raízes da equação são:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        sc.close();
    }
}
