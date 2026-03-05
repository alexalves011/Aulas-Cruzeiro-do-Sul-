import java.util.Scanner;

public class calculo {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("digite o total KM Percorrido");
        float c = leia.nextFloat();
        System.out.println("digite o total de litros de combustivel gasto ");
        float p = leia.nextFloat();

        System.out.println("a media é  : " + total(c, p));

    }

    public static float total(float a, float b) {
        return a / b;
    }

}
