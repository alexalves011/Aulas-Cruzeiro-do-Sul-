import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args) {
        float[] nota = new float[40];
        String[] nome = new String[40];
        float soma = 0, media;
        
        // Leitura dos nomes e notas de 40 alunos
        for(int i = 0; i < 40; i++) {
            nome[i] = JOptionPane.showInputDialog(null, 
                "Digite o nome do " + (i+1) + "º aluno");
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog(null, 
                "Digite a nota do aluno " + nome[i]));
            soma += nota[i];
        }
        
        // Calcula a média
        media = soma / 40;
        
        // Lista alunos com nota acima da média
        for(int i = 0; i < 40; i++) {
            if(nota[i] > media) {
                System.out.println("Parabéns " + nome[i]);
            }
        }
    }
}
