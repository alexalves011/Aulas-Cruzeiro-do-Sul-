public class simulado07 {
    public static void main(String[] args) {

        System.out.println("--- Números Pares de 1 a 20 ---");

        // O 'for' vai de 1 até 20, um por um (i++)
        for (int i = 1; i <= 20; i++) {
            
            // Verifica se o resto da divisão por 2 é zero
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}