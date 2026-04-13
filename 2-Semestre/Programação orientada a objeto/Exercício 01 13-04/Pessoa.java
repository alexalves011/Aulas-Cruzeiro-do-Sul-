public abstract class Pessoa {
    // Atributo privado (conforme o '-' no diagrama)
    private String nome;

    // Construtor
    public Pessoa() {
    }

    // Getters e Setters (conforme o '+' no diagrama)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método que será personalizado nas classes filhas
    public abstract String mostraClasse();
}