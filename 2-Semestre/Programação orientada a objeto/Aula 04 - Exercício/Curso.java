public class Curso {
    // Atributos
    String nome;
    int quantidadealunos;
    String turma;
    float mensalidade;

    //Construtor Vazio
    public Curso() {
    }

    // Construtor com Parâmetros
    public Curso(String n, int q, String t, float m) {
        this.nome = n;
        this.quantidadealunos = q;
        this.turma = t;
        this.mensalidade = m;
    }

    // Método para cadastrar (exemplo simples)
    public void cadastraCurso() {
        System.out.println("Curso cadastrado com sucesso!");
    }

    // Método para exibir os dados no console
    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de Alunos: " + quantidadealunos);
        System.out.println("Turma: " + turma);
        System.out.println("Mensalidade: R$ " + mensalidade);
    }

    // Método que calcula e retorna o faturamento total do curso
    public float calculaTotalMensalidade() {
        return quantidadealunos * mensalidade;
    }


}