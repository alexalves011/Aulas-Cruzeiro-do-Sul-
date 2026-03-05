import java.util.Scanner;

public class notachar {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String n, mensagem;

        System.out.println("Digite sua nota");
        n = leitor.next().toUpperCase();

        switch (n) {
            case "A":
                mensagem = "Exelente";
                break;
            case "B":
                mensagem = "Ótimo";
                break;
            case "C":
                mensagem = "Bom";
                break;
            case "D":
                mensagem = "Regular";
                break;
            case "F":
                mensagem = "Reprovado";
                break;

            default:
                mensagem = "valor invalido";
        }

        System.out.println(mensagem);

    }

}
