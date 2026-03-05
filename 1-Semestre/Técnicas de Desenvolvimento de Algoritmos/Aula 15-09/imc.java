import java.util.Scanner;

public class imc {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = leia.nextDouble();

        System.out.println("Digite seu peso");
        double peso = leia.nextDouble();

        double imc = peso/ (altura*altura);
        if(imc < 24.9){
            System.err.println("Normal");

        } else if (imc < 29.9){
            System.err.println("Sobrepeso");
        } else if(imc < 30.99){
            System.err.println("obesidade");
        } else{
            System.err.println("Gordo");
        }

        
    }
    
}
