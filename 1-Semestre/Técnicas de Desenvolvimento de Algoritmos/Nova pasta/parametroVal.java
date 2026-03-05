import java.util.Scanner;

public class parametroVal {

    public static void main(String[] args) {

        // 1. Declaração correta
        double salario; 

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o Salario do funcionario");
        // 2. Correção: Apenas atribuição, sem redeclarar o tipo
        salario = leia.nextDouble(); 

        System.out.println("Salario antes do metodo: " + salario);
        
        // 3. Correção: O método retorna um valor que atualiza a variável salario
        salario = calcularAumento(salario);
        
        System.out.println("Salario apos o metodo: " + salario);
        
        leia.close(); // É boa prática fechar o scanner
    }

    // 4. Correção: Mudamos de 'void' para 'double' para retornar o valor
    // Também corrigi o erro de digitação no nome (de calacular para calcular)
    public static double calcularAumento(double salario) {
        return salario * 1.03;
    }

}