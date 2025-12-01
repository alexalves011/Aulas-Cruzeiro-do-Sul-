public class simulado11 {

    public static void main(String[] args) {

        // 1. Início: Declaramos a variável FORA do loop
        int i = 1;

        // 2. Condição: Enquanto i for menor ou igual a 10
        while (i <= 10) {
            
            System.out.println(i);

            // 3. Passo: Aumentamos o valor de i
            // SE ESQUECER ISSO, O PROGRAMA TRAVA (Loop Infinito)
            i++; 
        }
    }
}