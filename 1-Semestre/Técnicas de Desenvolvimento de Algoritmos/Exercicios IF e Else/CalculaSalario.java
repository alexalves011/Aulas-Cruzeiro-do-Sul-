import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o turno de trabalho (N para Noturno, qualquer outra letra para Diurno): ");
        char turno = leia.next().toUpperCase().charAt(0); 

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horas = leia.nextInt();

        double valorHora;
        if (turno == 'N') {
            valorHora = 45.00;
        } else {
            valorHora = 37.50;
        }

        double salario = horas * valorHora;

        System.out.println("O salário é: R$ " + salario);

        leia.close();
    }
}
