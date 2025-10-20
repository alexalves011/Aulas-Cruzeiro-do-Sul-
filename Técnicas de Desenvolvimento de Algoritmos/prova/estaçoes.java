import java.util.Scanner;

public class estaçoes {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String estacao;
        String mes;

        System.out.println("DIgite o mês");
        mes = leitor.next().toLowerCase();

        switch (mes) {
            case "janeiro", "fevereiro", "dezembro":
                estacao = "Verão";
                break;

            case "junho", "julho", "agosto":
                estacao = "Inverno";
                break;

            case "março", "abril", "maio":
                estacao = "Outono";
                break;

            case "setembro", "outubro", "novembro":
                estacao = "Primavera";
                break;

            default:
                estacao = "Mês Invalido";
        }

        System.out.println(estacao);

    }

}