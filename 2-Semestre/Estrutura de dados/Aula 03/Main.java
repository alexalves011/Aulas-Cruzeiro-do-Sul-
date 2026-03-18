public class Main {

    public static void main(String[] args) {

        int[] v = { 19, 2, 3, 99, 67, 89 };

        int maior = v[0];
        int menor = v[0];

        for (int i = 0; i < v.length; i++) {

            if (v[i] > maior) {
                maior = v[i];
            }

            if (v[i] < menor) {
                menor = v[i];
            }

        }

        System.out.println(maior);
        System.out.println(menor);

    }

}