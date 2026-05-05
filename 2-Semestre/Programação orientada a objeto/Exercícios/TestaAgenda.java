public class TestaAgenda {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        // 1. Chama o método para preencher a matriz
        minhaAgenda.entDados();

        // 2. Imprime a lista completa
        minhaAgenda.imprimir();

        // 3. Exemplo de busca
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("\nDigite um nome para pesquisar: ");
        String nomeParaBusca = sc.nextLine();
        
        String resultado = minhaAgenda.busca(nomeParaBusca);
        System.out.println(resultado);
    }
}