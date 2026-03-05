import java.util.Scanner;

public class parametroVal {

    public static void main(String[] args) {

        double salario;

        Scanner leia = new Scanner(System.in);
        

        System.out.println("Digite o Salario do funcionario");
        double salario = leia.nextDouble();

        System.out.println("Salario antes do metodo" + salario);
        calacularAumento(salario);
        System.out.println("Salario apos o metodo" + salario);

    }

    public static void calacularAumento(double salario) {

        salario = salario * 1.03;

    }

}
