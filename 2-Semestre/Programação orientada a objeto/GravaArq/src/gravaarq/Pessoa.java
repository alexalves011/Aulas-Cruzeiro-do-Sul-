package gravaarq;

// Pessoa.java
public class Pessoa {
    private String nome;
    private int idade;
    private String cargo;

    public Pessoa(String nome, int idade) {
        this(nome, idade, "");
    }

    public Pessoa(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }

    // Formata o objeto como uma linha de texto para o arquivo
    @Override
    public String toString() {
        return nome + ";" + idade + ";" + cargo; // Usando ';' como separador
    }

    // Método estático para recriar o objeto a partir de uma linha do arquivo
    public static Pessoa fromString(String linha) {
        String[] partes = linha.split(";");
        String cargo = partes.length > 2 ? partes[2] : "";
        return new Pessoa(partes[0], Integer.parseInt(partes[1]), cargo);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCargo() {
        return cargo;
    }
}
