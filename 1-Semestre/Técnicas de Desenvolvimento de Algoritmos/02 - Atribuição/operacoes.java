import java.util.Scanner;

public class operacoes {
    
    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;
        int sub;
        int mult;


        System.out.println("Operações Matematica");

        System.out.println("Digite o Primeiro Número");
        numero1 = Leitor.nextInt();

        System.out.println("Digite o Segundo Número");
        numero2 = Leitor.nextInt();

        soma = numero1 + numero2;
        sub = numero1 - numero2;
        mult = numero1 * numero2;

        System.out.println("A soma entre os dois números é  " + soma + "  A subtração entre os dois números è " + sub + "  a Multiplicção entre os dois números è  " + mult );


    }
}
