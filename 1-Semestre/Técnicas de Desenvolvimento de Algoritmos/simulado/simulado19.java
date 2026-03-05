public class simulado19 {

    public static void main(String[] args) {

        int i = 1;
        int soma = 0;
        int totalNumeros = 10;

        do {
            // 1. Acumula o valor atual de i na soma
            soma += i;

            // 2. Incrementa para o próximo número
            i++;

        } while (i <= totalNumeros); // Lembra do ponto e vírgula aqui!

        // 3. Calcula a média
        // Usamos (double) para garantir que a divisão tenha vírgula (5.5)
        double media = (double) soma / totalNumeros;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
    }
}