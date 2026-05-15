import java.util.Arrays;

public class Fila {

    private int[] elementos;
    private int TAMANHO;
    private int inicio;
    private int fim;

    public Fila(int n) {
        this.elementos = new int[n];
        this.TAMANHO = n;
        this.inicio = 0;
        this.fim = 0;
    }

    public int remove() {
        int temp = elementos[inicio];
        elementos[inicio] = -1;
        ajustarFila();

        return temp;
    }

    public void insere(int n) {
        elementos[fim] = n;
        this.fim++;

    }

    private void ajustarFila() {
        for (int i = 1; i <= fim; i++) {
            this.elementos[i - 1] = this.elementos[i];

        }

        // System.out.println(Arrays.toString(this.elementos));
        System.out.println();

    }

    public String printElementos() {
        return Arrays.toString(this.elementos);
    }

}