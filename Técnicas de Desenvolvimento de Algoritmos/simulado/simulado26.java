public class simulado26 {

    public static void main(String[] args) {

        // 1. Criando uma matriz 3x3 (3 linhas, 3 colunas) com valores já preenchidos
        int[][] matriz = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("--- Elementos da Matriz ---");

        // 2. Loop externo: Percorre as LINHAS (i)
        for (int i = 0; i < matriz.length; i++) {

            // 3. Loop interno: Percorre as COLUNAS (j) daquela linha
            for (int j = 0; j < matriz[i].length; j++) {
                
                // Imprime o elemento e um espaço, SEM pular linha
                System.out.print(matriz[i][j] + " ");
            }

            // 4. Pula uma linha depois de imprimir todas as colunas daquela linha
            System.out.println();
        }
    }
}