package gravaarq;

// GerenciadorArquivo.java
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorArquivo {
    private String nomeArquivo;

    public GerenciadorArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

   
    // Grava uma lista de pessoas no arquivo
    public void gravarPessoas(List<Pessoa> pessoas) throws IOException {
        // try-with-resources garante fechamento automático
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Pessoa p : pessoas) {
                writer.write(p.toString());
                writer.newLine(); // Nova linha
            }
        }
    }

    // Lê pessoas do arquivo e retorna uma lista
    public List<Pessoa> lerPessoas() throws IOException {
        List<Pessoa> pessoas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                pessoas.add(Pessoa.fromString(linha));
            }
        }
        return pessoas;
    }
}

