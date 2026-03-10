import java.util.Locale;

public class Paciente {
    private String nome;
    private String rg;
    private String endereco;
    private String telefone;
    private String dataNascimento;
    private String profissao;

    
    public Paciente() {
        this.nome = "";
        this.rg = "";
        this.endereco = "";
        this.telefone = "";
        this.dataNascimento = "";
        this.profissao = "";
    }

    public Paciente(String nome) {
        this(); 
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String toString() {
        return String.format(Locale.US,
                "Nome: %s\nRG: %s\nEndereço: %s\nTelefone: %s\nData de Nascimento: %s\nProfissão: %s\n",
                nome, rg, endereco, telefone, dataNascimento, profissao);
    }
}
