public class ContaCorrente {
    // Atributos
    public String nome;
    public float saldo;
    public float limite;
    public char tipo;

    // Construtor 1: Com nome, saldo e tipo
    public ContaCorrente(String n, float s, char t) {
        this.nome = n;
        this.saldo = s;
        this.tipo = t;
    }

    // Construtor 2: Com nome, saldo e limite (ajustado conforme o diagrama)
    public ContaCorrente(String n, float s, float l) {
        this.nome = n;
        this.saldo = s;
        this.limite = l;
    }

    // Construtor 3: Vazio (padrão)
    public ContaCorrente() {
    }

    // Método para cadastrar dados manualmente
    public void cadastraDados(String n, float s, float l, char t) {
        this.nome = n;
        this.saldo = s;
        this.limite = l;
        this.tipo = t;
    }

    // Método para imprimir dados (retorna uma String com as informações)
    public String imprimeDados() {
        return "Nome: " + nome + " | Saldo: R$" + saldo + " | Limite: R$" + limite + " | Tipo: " + tipo;
    }

    // Método para depositar
    public void depositar(float valor) {
        this.saldo += valor;
    }

    // Método para sacar
    public void sacar(float valor) {
        if (valor <= (saldo + limite)) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para o saque de: " + valor);
        }
    }
}