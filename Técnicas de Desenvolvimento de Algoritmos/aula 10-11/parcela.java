import java.util.Scanner;

public class parcela {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("digite o valor da compra");
        float c = leia.nextFloat();
        System.out.println("digite o valor da parcela");
        float p = leia.nextFloat();

        System.out.println("a area total é : " + total(c, p));

    }

    public static float total(float a, float b) {
        return (a / b) * 0.5 ;
    }

}
