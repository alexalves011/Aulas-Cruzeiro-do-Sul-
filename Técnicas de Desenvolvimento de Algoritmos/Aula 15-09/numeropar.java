import java.util.Scanner;

public class numeropar {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print(" Digite um numero ");
        int numero = leia.nextInt();
        if(numero%2==0){
        System.out.print(numero + "O seu numero é par");
        } else{
            System.out.println("Seu numero é impar");
        }

    }


}