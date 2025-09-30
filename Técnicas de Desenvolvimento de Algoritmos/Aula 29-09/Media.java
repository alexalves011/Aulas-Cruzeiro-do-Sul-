import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota");
        nota1 = leia.nextDouble();

        System.out.println("Digite a segunda nota");
        nota2 = leia.nextDouble();

        System.out.println("Digite o tipo de Media\n(A - Aritmetica, P - Ponderada");
        char tipoMedia = leia.next().toUpperCase().charAt(0);

        switch (tipoMedia) {
            case 'A':
                media = (nota1 + nota2) / 2;
                System.out.println("A média é: " + media);
                break;

            case 'P':
                media = (nota1 * 3 + nota2 * 7) / (3 + 7);
                System.out.println("A média é: " + media);
                break;

            default:
                System.out.println("Tipo de media invalida");
                break;
        }

    }

}
