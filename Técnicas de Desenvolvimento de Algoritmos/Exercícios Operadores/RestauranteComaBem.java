import java.util.Scanner;

public class RestauranteComaBem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do valor gasto
        System.out.print("Digite o valor gasto no restaurante: ");
        double valorGasto = sc.nextDouble();

        // Calcula os 10% do garçom
        double taxaGarcom = valorGasto * 0.10;
        double valorTotal = valorGasto + taxaGarcom;

        // Exibe o resultado
        System.out.println("Taxa do garçom (10%): R$ " + taxaGarcom);
        System.out.println("Valor total a pagar: R$ " + valorTotal);

        sc.close();
    }
}
