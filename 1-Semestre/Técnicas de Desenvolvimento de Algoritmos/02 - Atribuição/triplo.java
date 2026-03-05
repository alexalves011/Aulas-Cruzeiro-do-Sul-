import java.util.Scanner;

public class triplo {
    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);

        int numeroReal;
        int triplo;

        System.out.println("Triplicando Numero Real");

        System.out.println("Digite o Numero Real");
        numeroReal = Leitor.nextInt();

        triplo = numeroReal * 3;

        System.out.println("o triplo de " + ""  + numeroReal + "  é  " + triplo );

    }
    
}
