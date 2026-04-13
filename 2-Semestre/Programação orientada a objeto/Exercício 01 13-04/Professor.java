public class Professor extends Pessoa {
    private int matricula;
    private String campus;

    public Professor() {
        super();
    }

    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String mostraClasse() {
        return "Classe: Professor";
    }
}