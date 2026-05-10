public class Aluno {
    private int rgm;
    private String nome;
    private float mensalidade;
    private int anoNascimento;

    public Aluno(int rgm, String nome, float mensalidade, int anoNascimento) {
        this.rgm = rgm;
        this.nome = nome;
        this.mensalidade = mensalidade;
        this.anoNascimento = anoNascimento;
    }

    public int getRgm() {
        return rgm;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Aluno: \n" +
               "RGM: " + rgm + "\n" +
               "Nome: " + nome + "\n" +
               "Mensalidade: R$ " + mensalidade + "\n" +
               "Ano de Nascimento: " + anoNascimento;
    }
}
