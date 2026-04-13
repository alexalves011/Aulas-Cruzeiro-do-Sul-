import javax.swing.JOptionPane;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p = null;

        while (true) {
            // Criando o menu com JOptionPane
            String menu = "Digite uma opção:\n"
                        + "1 - Aluno\n"
                        + "2 - Professor\n"
                        + "3 - Funcionário\n"
                        + "4 - Sair";
            
            // O JOptionPane sempre retorna String, por isso usamos o parseInt
            int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            switch (tipo) {
                case 1:
                    p = new Aluno();
                    break;
                case 2:
                    p = new Professor();
                    break;
                case 3:
                    p = new Funcionario();
                    break;
                case 4:
                    System.out.println("Bye... bye");
                    System.exit(0); // Fecha o programa
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.exit(0);
                    break;
            }

            // Exibe o nome da classe usando a lógica que o print pediu
            if (p != null) {
                JOptionPane.showMessageDialog(null, p.mostraClasse());
            }
        }
    }
}