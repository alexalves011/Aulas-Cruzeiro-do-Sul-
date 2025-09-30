import java.util.Scanner;

public class parcela {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double valorParcelado, valorCompra, valorFinal;
        int juros, qtdParcelas;

        System.out.print("Entre com o valor da compra R$ ");
        valorCompra = leia.nextDouble();

        System.out.print("Entre com a quantidade de parcelas");
        qtdParcelas = leia.nextInt();

        switch (qtdParcelas) {
            case 2:
                juros = 3;
                break;

            case 4:
                juros = 7;
                break;

            case 6:
                juros = 9;
                break;

            case 8:
                juros = 12;
                break;

            default:
                juros = -1;
                break;
        }

        if (juros == -1) {
            System.out.print("Numeros de parcelas incorreto");
        } else {
            valorFinal = valorCompra + valorCompra * juros / 100;
            valorParcelado = valorFinal / qtdParcelas;
            System.out.print("O valor da parcela é " + valorParcelado);

        }

    }

}
