import java.util.Scanner;

public class cal{


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int n1,n2,total;
        String op;

        System.out.println("digite o primeiro numero ");
        n1 = leitor.nextInt();

        System.out.println("digite o segundo  numero");
        n2 = leitor.nextInt();

        System.out.println("digite o tipo de operação (+ - X %)");
        op = leitor.next();

        if (op.equals("+")){
            total = n1 + n2;


        } else if (op.equals("-")){
            total = n1 - n2;
        } else if (op.equals("X")){
            total = n2 * n1;
        }else {
            total = n1 / n2;
        }

        System.out.println("Operação final " + total);



    }

}


