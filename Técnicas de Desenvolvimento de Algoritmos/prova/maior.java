import java.util.Scanner;

public class maior {

    public static void main(String[] args) {

       Scanner leitor = new Scanner (System.in);

       int n1,n2,n3;

       System.out.println("Digite o primeiro número");
       n1 = leitor.nextInt();
       System.out.println("Digite o segundo número ");
       n2 = leitor.nextInt();
       System.out.println("Digite o terceiro número");
       n3 = leitor.nextInt();

       if (n1 > n2 & n1 > n3){
        System.out.println("o Maior número é " + n1);
       } else if (n2 > n1 & n2 > n3){
        System.out.println("O Maior Número é " + n2);
       } else if (n3 > n1 & n3 > n2){
        System.out.println("O mair número" + n3);
       } else {
        System.out.println("Números ivalidos ou com valores iguais");
       }
        
    }}
    

