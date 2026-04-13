public class Aluno extends Pessoa {
    private String rgm;

    public Aluno() {
        super(); // Chama o construtor da classe pai (Pessoa)
    }

    // Getters e Setters para o RGM
    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    // Implementação obrigatória do método abstrato
    @Override
    public String mostraClasse() {
        return "Classe: Aluno";
    }
}