import java.util.Scanner;

public class FaixaEtariaCategoria {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a categoria (1-4):");
        System.out.println("1: Criança | 2: Adolescente | 3: Adulto | 4: Idoso");
        int categoria = leitor.nextInt();

        String faixaEtaria;

        switch (categoria) {
            case 1:
                faixaEtaria = "0 a 12 anos - Criança";
                break;
            case 2:
                faixaEtaria = "13 a 17 anos - Adolescente";
                break;
            case 3:
                faixaEtaria = "18 a 59 anos - Adulto";
                break;
            case 4:
                faixaEtaria = "60 anos ou mais - Idoso";
                break;
            default:
                faixaEtaria = "Categoria inválida.";
                break; // O 'break' no default é opcional, mas uma boa prática
        }

        System.out.println(faixaEtaria);

        leitor.close();
    }
}