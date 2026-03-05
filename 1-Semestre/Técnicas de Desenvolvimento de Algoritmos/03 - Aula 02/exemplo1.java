import javax.swing.JOptionPane;

public class exemplo1{
    public static void main(String[] args) {
        double peso, altura, imc;
        String saida;
        peso = Double.parseDouble(JOptionPane.showInputDialog(
            null, "Digite o seu peso em kg :"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(
            null, "Digite sua Altura e M" ));
            imc = peso / (altura * altura);

            saida = String.format("Seu IMC é % .2f kg / m2", imc);
            javax.swing.JOptionPane.showMessageDialog(null, saida);
            System.out.println(saida);
    }
}