import java.util.Scanner;

public class area {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("digite o primeiro valor");
        float x = leia.nextFloat();
        System.out.println("digite o segundo valor");
        float y = leia.nextFloat();

        System.out.println("a area total é : " + soma(x, y));

    }

    public static float soma(float a, float b) {
        return a * b;
    }

}
