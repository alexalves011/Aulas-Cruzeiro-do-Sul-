// Importa a classe JOptionPane do pacote javax.swing, que é usada para criar caixas de diálogo gráficas.
import javax.swing.JOptionPane;

// Declara uma classe pública chamada "Exemplo1". Todo o código Java deve estar dentro de uma classe.
public class Exemplo1 {

    // Este é o método principal (main), o ponto de entrada onde a execução do programa começa.
    public static void main(String[] args) {

        // Usa o método estático "showMessageDialog" da classe JOptionPane para exibir uma pequena janela (caixa de diálogo)
        // O primeiro argumento 'null' faz a janela aparecer no centro da tela.
        // O segundo argumento "Ola Mundo" é a mensagem que será exibida dentro da janela.
        JOptionPane.showMessageDialog(null,"Olá Mundo!");

    } // Fim do método main
    
} // Fim da classe Exemplo1