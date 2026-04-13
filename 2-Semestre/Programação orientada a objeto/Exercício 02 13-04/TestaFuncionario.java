public class TestaFuncionario {
    public static void main(String[] args) {
        
        // 1. Criando um Gerente usando o construtor com parâmetros e setters
        Gerente g1 = new Gerente();
        g1.setNome("Alex Alves");
        g1.setCpf("123.456.789-00");
        g1.setSalario(5000.00);
        g1.setSenha(1234);
        g1.setFuncionariosGerenciados(5);

        // 2. Criando um Caixa usando o construtor da classe pai
        Caixa c1 = new Caixa();
        c1.setNome("Felipe");
        c1.setCpf("987.654.321-11");
        c1.setSalario(2000.00);

        // Exibindo os dados e testando os métodos
        System.out.println("--- Dados do Gerente ---");
        System.out.println("Nome: " + g1.getNome());
        System.out.println("Bonificação (15%): R$ " + g1.bonificacao());
        System.out.println("Autenticou? " + g1.autentica());

        System.out.println("\n--- Dados do Caixa ---");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Bonificação (10%): R$ " + c1.bonificacao());
    }
}