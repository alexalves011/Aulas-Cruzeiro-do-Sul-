import java.util.Scanner;

public class media {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);

        System.err.println("Digite a Primeira nota");
        double nota1 = tc.nextDouble();

        System.err.println("Digite a Segunda nota");
        double nota2 = tc.nextDouble();

        System.err.println("Digite a Terceira nota");
        double nota3 = tc.nextDouble();

        int peso1=1;
        int peso2=2;
        int peso3=4;

        double media = (nota1*peso1+nota2*peso2+nota3*peso3) / (peso1+peso2+peso3);

        System.err.println("Media ponderada é :" + media);



    }
}
