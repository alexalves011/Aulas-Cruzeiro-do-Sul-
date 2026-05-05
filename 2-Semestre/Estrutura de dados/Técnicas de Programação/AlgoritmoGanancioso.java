import java.util.ArrayList;
import java.util.List;

public class AlgoritmoGanancioso {
    public static List<Integer> darTroco(int[] moedas, int valor) {
        List<Integer> moedasUsadas = new ArrayList<>();
        // As moedas devem estar em ordem decrescente para a lógica gulosa
        for (int moeda : moedas) {
            while (valor >= moeda) {
                valor -= moeda;
                moedasUsadas.add(moeda);
            }
        }
        return moedasUsadas;
    }

    public static void main(String[] args) {
        int[] sistemaMoedas = {25, 10, 5, 1}; // Exemplo do vídeo [00:18:03]
        int valorTroco = 65;
        List<Integer> resultado = darTroco(sistemaMoedas, valorTroco);
        System.out.println("Moedas usadas: " + resultado);
        System.out.println("Total de moedas: " + resultado.size());
    }
}