public class Empregado {
    protected String nome;
    protected String matricula;

    public Empregado() {
    }

    public Empregado(String n, String m) {
        this.nome = n;
        this.matricula = m;
    }

    // Métodos de acesso
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public float calculaSalario() {
        return 0.0f;
    }
}