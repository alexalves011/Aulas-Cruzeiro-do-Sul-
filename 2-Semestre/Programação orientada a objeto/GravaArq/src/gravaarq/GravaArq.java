package gravaarq;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GravaArq {

    public static void main(String[] args) {
        String arquivo = "dados.txt";
        GerenciadorArquivo ga = new GerenciadorArquivo(arquivo);

        // 1. Criar objetos
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa("Ana", 25, "Analista"));
        listaPessoas.add(new Pessoa("João", 35, "Gerente"));
        listaPessoas.add(new Pessoa("Bruno", 30, "Desenvolvedor"));
        listaPessoas.add(new Pessoa("Alex", 20, "Estagiário"));

        // 2. Gravar no arquivo
        try {
            ga.gravarPessoas(listaPessoas);
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao gravar: " + e.getMessage());
        }

        // 3. Ler do arquivo
        try {
            List<Pessoa> pessoasLidas = ga.lerPessoas();
            System.out.println("\nDados lidos do arquivo:");
            for (Pessoa p : pessoasLidas) {
                System.out.println("Nome: " + p.getNome() + ", Idade: " + p.getIdade() + ", Cargo: " + p.getCargo());
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler: " + e.getMessage());
        }
    }
}
