import java.util.Scanner;

public class Agenda {
    // Atributo privado: Matriz de Strings
    // dados[n][0] armazenará o nome e dados[n][1] o telefone
    private String[][] dados;

    // Construtor padrão
    public Agenda() {
    }

    // Construtor que recebe a matriz pronta
    public Agenda(String[][] dados) {
        this.dados = dados;
    }

    // Método para entrada de dados via teclado
    public void entDados() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de pessoas que deseja cadastrar: ");
        int n = sc.nextInt();
        sc.nextLine(); // Limpar o buffer do teclado

        // Inicializa a matriz com n linhas e 2 colunas
        this.dados = new String[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Registro " + (i + 1) + " ---");
            System.out.print("Nome: ");
            this.dados[i][0] = sc.nextLine();
            System.out.print("Telefone: ");
            this.dados[i][1] = sc.nextLine();
        }
    }

    // Método para imprimir todos os dados da matriz
    public void imprimir() {
        if (dados == null || dados.length == 0) {
            System.out.println("A agenda está vazia.");
            return;
        }

        System.out.println("\n========= DADOS DA AGENDA =========");
        for (int i = 0; i < dados.length; i++) {
            System.out.println("Nome: " + dados[i][0] + " | Telefone: " + dados[i][1]);
        }
        System.out.println("===================================");
    }

    // Método para buscar um nome e retornar o telefone correspondente
    public String busca(String nome) {
        if (dados == null) return "Agenda não inicializada.";

        for (int i = 0; i < dados.length; i++) {
            // Compara o nome ignorando maiúsculas/minúsculas
            if (dados[i][0].equalsIgnoreCase(nome)) {
                return "Telefone de " + nome + ": " + dados[i][1];
            }
        }
        return "O nome '" + nome + "' não foi encontrado na agenda.";
    }

        // Métodos de acesso (Getters e Setters)
        public String[][] getDados() {
            return dados;
        }

        public void setDados(String[][] dados) {
            this.dados = dados;
        }
    }