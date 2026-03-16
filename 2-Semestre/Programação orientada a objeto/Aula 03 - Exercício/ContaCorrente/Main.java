public class Main {
    public static void main(String[] args) {
   

        // Instanciando o primeiro objeto com construtor de 3 parâmetros
        ContaCorrente conta1 = new ContaCorrente("João Silva", 1000.0f, 'P');
        conta1.limite = 500.0f; // Definindo limite manualmente

        // Instanciando o segundo objeto com construtor vazio e cadastrando dados
        ContaCorrente conta2 = new ContaCorrente();
        conta2.cadastraDados("Maria Oliveira", 2500.0f, 1000.0f, 'C');

        // Realizando operações na conta 1
        conta1.depositar(200.0f);
        conta1.sacar(100.0f);

        // Imprimindo resultados
        System.out.println(conta1.imprimeDados());
        System.out.println(conta2.imprimeDados());
    }
}