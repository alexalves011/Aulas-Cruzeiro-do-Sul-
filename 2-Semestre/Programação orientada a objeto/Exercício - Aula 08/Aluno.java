import javax.swing.JOptionPane;

public class Aluno {
    private String rgm;
    private float[] notas;
    private float media;
    
    // Construtor vazio
    public Aluno() {
        this.rgm = "";
        this.notas = new float[0];
        this.media = 0;
    }
    
    // Construtor com RGM e quantidade de notas
    public Aluno(String rgm, int qtde) {
        this.rgm = rgm;
        this.notas = new float[qtde];
        this.media = 0;
    }
    
    // Construtor com apenas quantidade de notas
    public Aluno(int qtde) {
        this.rgm = "";
        this.notas = new float[qtde];
        this.media = 0;
    }
    
    // Método para leitura das notas
    public void leitura() {
        this.rgm = JOptionPane.showInputDialog(null, 
            "Digite o RGM do aluno");
        
        for(int i = 0; i < notas.length; i++) {
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog(null, 
                "Digite a nota " + (i+1) + " do aluno " + rgm));
        }
    }
    
    // Método para calcular a média
    public float calculaMedia() {
        float soma = 0;
        for(int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        this.media = soma / notas.length;
        return this.media;
    }
    
    // Método para exibir os dados
    public void print() {
        System.out.println("RGM: " + rgm);
        System.out.print("Notas: ");
        for(int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println("\nMédia: " + media);
    }
    
    // Getters
    public String getRgm() {
        return rgm;
    }
    
    public float[] getNotas() {
        return notas;
    }
    
    public float getMedia() {
        return media;
    }
}
