public class Gerente extends Funcionario {
    private int senha;
    private int funcionariosGerenciados;

    // Construtor padrão
    public Gerente() {
        super();
    }

    // Construtor específico do diagrama (senha e func. gerenciados)
    public Gerente(int s, int fG) {
        this.senha = s;
        this.funcionariosGerenciados = fG;
    }

    // Getters e Setters
    public int getSenha() { return senha; }
    public void setSenha(int senha) { this.senha = senha; }

    public int getFuncionariosGerenciados() { return funcionariosGerenciados; }
    public void setFuncionariosGerenciados(int funcionariosGerenciados) { 
        this.funcionariosGerenciados = funcionariosGerenciados; 
    }

    // Sobrescrita da bonificação: Gerentes recebem 15%
    @Override
    public double bonificacao() {
        return this.getSalario() * 0.15;
    }

    // Método de autenticação (exemplo simples de validação de senha)
    @Override
    public boolean autentica() {
        // No mundo real, compararíamos com a senha salva
        return true; 
    }
}