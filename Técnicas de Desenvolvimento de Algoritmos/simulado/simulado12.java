public class simulado12 {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 20) {
            
            // 1. PRIMEIRO verificamos se é par
            if (i % 2 == 0) {
                System.out.println(i); // Imprime o número, não "true/false"
            }

            // 2. IMPORTANTE: O i++ tem que ficar FORA do if
            // Se você colocar dentro do if, o programa trava no número 1 (loop infinito)
            i++; 
        }
    }
}