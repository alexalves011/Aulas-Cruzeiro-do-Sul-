public class Curso {

    // Atributos
    public String nome;
    public int quantidadeAlunos;
    public String turma;
    public float mensalidade;

    public Curso() {

    }

    public Curso(String nome, int quantidadeAlunos, String turma, float mensalidade) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
        this.turma = turma;
        this.mensalidade = mensalidade;

    };

    public void Imprimirdados () {
        System.out.println("Dados do curso");


    }

}

// pesquisar sobrecarga de metodos 