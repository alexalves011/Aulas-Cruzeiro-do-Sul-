import java.util.Scanner;

public class idade {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade;
        
        System.out.println("Digite sua idade");
        idade = leitor.nextInt();

        if(idade < 13){
            System.out.println("Criança");
        } else if (idade >= 13 && idade <18 ){
            System.out.println("Adolecesnte");
        } else if (idade >= 18 && idade <60){
            System.out.println("Adulto");
        } else{
            System.out.println("Idoso");
        }




    }
}