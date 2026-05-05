
import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {
        String[] estados = new String[10];

        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        // for (int i = 0; i < estados.length; i++) {
        // System.out.println(estados[i]);
        // }

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual Sigla de estado voce quer buscar ?");
        String siglaBusca = leitor.nextLine();

        // buscar linear
        boolean encontrou = false;

        for (int i = 0; i < estados.length; i++) {
            String estadoAtual = estados[i];

            if (estadoAtual.equalsIgnoreCase(siglaBusca)) { // Usei ignoreCase para facilitar
                encontrou = true;
                break; // Para o loop assim que encontrar
            }
        }

        // A verificação final fica FORA do loop for
        if (encontrou) {
            System.out.println("Achou!");
        } else {
            System.err.println("Não achou.");
        }

    }

}
