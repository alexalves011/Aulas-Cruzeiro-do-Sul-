public class simulado09 {
    public static void main(String[] args) {

        int soma = 0;
        int totalNumeros = 10; // Boa prática: evitar "números mágicos" soltos no código

        // 1. O loop acumula a soma
        for (int i = 1; i <= totalNumeros; i++) {
            soma += i;
        }

        // 2. O Pulo do Gato (Casting)
        // Colocamos (double) antes da soma. Isso diz ao Java: 
        // "Trate 'soma' como decimal temporariamente só para essa conta".
        double media = (double) soma / totalNumeros;

        System.out.println("A média é: " + media);
    }
} 
    

