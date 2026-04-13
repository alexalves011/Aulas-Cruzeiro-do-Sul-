public class Caixa extends Funcionario {

    // Construtor padrão
    public Caixa() {
        super();
    }

    // Sobrescrita da bonificação: Funcionários comuns (como o Caixa) recebem 10%
    // No diagrama, ele também pede para garantir que o método exista aqui
    @Override
    public double bonificacao() {
        return this.getSalario() * 0.10;
    }
}