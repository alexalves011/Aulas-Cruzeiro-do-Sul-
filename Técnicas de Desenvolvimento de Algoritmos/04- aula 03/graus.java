import java.util.Scanner;
public class graus {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor de angulo em graus");
        double graus = leia.nextDouble();
        double radianos = Math.toRadians(graus);

        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);

        System.out.println("\nResultado: ");
        System.out.println("Angulos em graus: " + graus+ "°");
        System.out.println("Angulos em Radianos: " +radianos+ "red");
        System.out.println("Seno: " +seno);
        System.out.println("cosseno:  "+cosseno);
        System.out.println("Tangente: "+tangente);
        leia.close();

    }
}
