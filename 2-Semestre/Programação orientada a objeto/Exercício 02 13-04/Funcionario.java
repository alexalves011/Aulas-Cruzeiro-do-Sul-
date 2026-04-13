public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    // Construtor vazio
    public Funcionario() {
    }

    // Construtor com parâmetros (conforme o diagrama)
    public Funcionario(String n, String c, double s) {
        this.nome = n;
        this.cpf = c;
        this.salario = s;
    }

    // Métodos de acesso (Getters e Setters)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    // Método de autenticação genérico
    public boolean autentica() {
        return false; 
    }

    // Regra: Funcionários comuns recebem 10%
    public double bonificacao() {
        return this.salario * 0.10;
    }
}