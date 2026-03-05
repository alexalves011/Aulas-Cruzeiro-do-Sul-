public class simulado13 {

    public static void main(String[] args) {

        int soma = 0;
        int i = 1; // Começamos do 1 (fica mais fácil de entender)

        while (i <= 10) {

            // 1. PRIMEIRO somamos o valor atual de i
            soma = soma + i; 
            // (Ou: soma += i;)

            // 2. DEPOIS aumentamos o contador
            // Se colocar isso antes da soma, você soma o número errado
            i++; 
        }

        // 3. Imprimimos o resultado FINAL fora do loop
        System.out.println("A soma total é: " + soma);
    }

}