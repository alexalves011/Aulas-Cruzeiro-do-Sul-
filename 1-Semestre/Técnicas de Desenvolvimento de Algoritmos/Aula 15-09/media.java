import java.util.Scanner;

public class media {

public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    System.out.println("Digite sua media");
    int media = leia.nextInt();

    System.out.println("Digite sua frequencia");
    int frequencia = leia.nextInt();

    if(frequencia < 75){
        System.out.println("Reprovado falta");

    } else if (media < 6){
        System.out.println("Reprovado por nota");
    } else{
        System.out.println("Aprovado");
    }
    
}
    

}
