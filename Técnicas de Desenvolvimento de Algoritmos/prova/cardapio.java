
import java.util.Scanner;

public class cardapio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String mensagem;
        int cod;

        System.out.println("Cardapio");
        System.out.println("--------------------------------------------------------");
        System.out.println(" codigo: 100 - Item: Cachorro Quente - Preço: R$ 10,00");
        System.out.println("--------------------------------------------------------");
        System.out.println(" codigo: 101 - Bauru Simples - Preço: R$ 12,00");
        System.out.println("--------------------------------------------------------");
        System.out.println(" codigo: 102 - Item: Bauru com ovo - Preço: R$ 13,00");
        System.out.println("--------------------------------------------------------");
        System.out.println(" codigo: 103 - Item: empada - Preço: R$ 7,00");
        System.out.println("--------------------------------------------------------");

        System.out.println("Digite o codigo do intem que você deseja");
        cod = leitor.nextInt();

        switch (cod) {
            case 100:
                mensagem = " codigo: 100 - Item: Cachorro Quente - Preço: R$ 10,00";
                break;

            case 101:
                mensagem = " codigo: 101 - Bauru Simples - Preço: R$ 12,00)";
                break;
            case 102:
                mensagem = " codigo: 102 - Item: Bauru com ovo - Preço: R$ 13,00";
                break;
            case 103:
                mensagem = " codigo: 102 - Item: Bauru com ovo - Preço: R$ 13,00";
                break;

            default:
                mensagem = "Codigo invalido";

        }

        System.out.println(mensagem);
        leitor.close();

    }

}
