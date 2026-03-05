import java.util.Scanner;

public class piso {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a Largura");
        double larg = tc.nextDouble();

        System.out.println("Digite o comprimento da area em metros ");
        double comp = tc.nextDouble();

        System.out.println("Digite o valor a caixa de piso R$  ");
        double valor_uni = tc.nextDouble();

        double n_caixa = larg*comp;

        double caixa = Math.ceil(n_caixa/2.5);

        double custo_total = valor_uni*caixa;

        System.out.println("area total a ser coberta :  " + n_caixa + "m²");
        System.out.println("Quantidade de caixa necessaria  " + n_caixa);
        System.out.printf("Custo total : R$ %2.f\n", custo_total );

    }
}
