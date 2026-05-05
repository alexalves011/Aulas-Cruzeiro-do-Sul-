public class DivisaoConquista {
    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(arr, inicio, fim);
            quickSort(arr, inicio, indicePivo - 1);
            quickSort(arr, indicePivo + 1, fim);
        }
    }

    private static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = (inicio - 1);
        for (int j = inicio; j < fim; j++) {
            if (arr[j] <= pivo) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] vetor = {10, 5, 9, 8, 3, 1};
        quickSort(vetor, 0, vetor.length - 1);
        System.out.print("Array Ordenado: ");
        for (int i : vetor) System.out.print(i + " ");
    }
}