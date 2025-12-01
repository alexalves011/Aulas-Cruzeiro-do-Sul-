import java.util.Scanner;

public class parcela {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("digite o valor da compra:");
        float c = leia.nextFloat();

        System.out.println("digite o NÚMERO total de parcelas:");
        int qntParcelas = leia.nextInt(); // Usamos nextInt() pois é um número inteiro

        // Definimos a taxa (0.05f é 5%)
        float taxa = 0.05f;

        // 1. Calcula o valor final aplicando a taxa
        float valorFinal = totalComJuros(c, taxa);

        // 2. Calcula o valor de cada parcela
        float valorDaParcela = valorFinal / qntParcelas;
        
        // 3. Mostra os resultados
        System.out.println("------------------------------------");

        // --- CORREÇÃO AQUI ---
        // Era "5% juros", mudou para "5%% juros"
        System.out.printf("Valor final da compra (com 5%% juros): R$ %.2f\n", valorFinal);
        
        System.out.printf("Valor de cada parcela (%dx): R$ %.2f\n", qntParcelas, valorDaParcela);
        
        System.out.println("------------------------------------");

    }

    /**
     * Calcula o valor final com juros.
     * @param valor (valor total da compra)
     * @param taxa (taxa de juros, ex: 0.05f para 5%)
     * @return O valor final com juros.
     */
    public static float totalComJuros(float valor, float taxa) {
        return valor * (1 + taxa);
    }

} // Fim da classe parcela