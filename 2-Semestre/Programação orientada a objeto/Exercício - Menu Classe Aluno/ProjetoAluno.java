import java.util.Scanner;

public class ProjetoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = null;
        int opcao;

        do {
            System.out.println("\n=== Menu ProjetoAluno ===");
            System.out.println("1 - cadastrar dados do aluno");
            System.out.println("2 - alterar dados do aluno");
            System.out.println("3 - listar dados aluno");
            System.out.println("9 - sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    aluno = cadastrarAluno(scanner);
                    break;
                case 2:
                    if (aluno != null) {
                        alterarAluno(scanner, aluno);
                    } else {
                        System.out.println("Nenhum aluno cadastrado. Use a opcao 1 primeiro.");
                    }
                    break;
                case 3:
                    if (aluno != null) {
                        System.out.println(aluno);
                    } else {
                        System.out.println("Nenhum aluno cadastrado para listar.");
                    }
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 9);

        scanner.close();
    }

    private static Aluno cadastrarAluno(Scanner scanner) {
        System.out.print("Informe o RGM: ");
        int rgm = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a mensalidade: ");
        float mensalidade = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Aluno cadastrado com sucesso!");
        return new Aluno(rgm, nome, mensalidade, anoNascimento);
    }

    private static void alterarAluno(Scanner scanner, Aluno aluno) {
        System.out.println("\n=== Alterar dados do aluno ===");
        System.out.print("Informe o novo RGM (atual: " + aluno.getRgm() + "): ");
        aluno.setRgm(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Informe o novo nome (atual: " + aluno.getNome() + "): ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Informe a nova mensalidade (atual: " + aluno.getMensalidade() + "): ");
        aluno.setMensalidade(scanner.nextFloat());
        scanner.nextLine();

        System.out.print("Informe o novo ano de nascimento (atual: " + aluno.getAnoNascimento() + "): ");
        aluno.setAnoNascimento(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Dados do aluno alterados com sucesso!");
    }
}
