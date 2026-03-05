
import java.util.Scanner;


public class MinutosDesdeMeiaNoite {

    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);

        int horas;
        int minutos;
        int totalMinutos;
        
        System.err.println("Calculando minutos desde o Inicio do dia");

        System.err.println("Digite o valor da hora");
        horas = Leitor.nextInt();

        System.err.println("Digite o valor do minuto");
        minutos = Leitor.nextInt();

        totalMinutos = (horas * 60) + minutos;

        System.out.println("Desde o início do dia se passaram: " + totalMinutos + " minutos.");

       
        Leitor.close();

    }
    
}
