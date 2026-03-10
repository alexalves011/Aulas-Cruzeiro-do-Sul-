
public class Main {

    public static void main(String[] args) {

        // System.out.println("Hello word");

        // int a = 8;
        // int b = 10;

        int[] v = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < v.length; i++) {
            //System.out.println(v[i]);
        }

        int inicio = 0;
        int fim = v.length - 1;
        int tempo = 0;

        while (inicio <= fim) {
            tempo = v[inicio];
            v[inicio] = v[fim];
            v[fim] = tempo;
            inicio++;
            fim--;
        }

        for (int i = 0; i < v.length; i++) {
            //System.out.println(v[i]);
        }


         for (int i = 0; i < v.length; i++) {
            int soma = i + i;

            System.out.println(soma);
        }


        

    }

};