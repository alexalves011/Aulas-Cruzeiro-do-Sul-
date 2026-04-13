public class Funcionario extends Pessoa {
    private int matricula;
    private String setor;

    public Funcionario() {
        super();
    }

    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String mostraClasse() {
        return "Classe: Funcionario";
    }
}