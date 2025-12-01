public class simulado14 {

    public static void main(String[] args) {

        int soma = 0;
        int i = 1;
        int totalNumeros = 10; // Quantidade de números que vamos somar

        // 1. Fase de Acumulação (Soma)
        while (i <= totalNumeros) {
            soma += i;  // Soma o valor de i
            i++;        // Avança para o próximo número
        }

        // 2. Fase do Cálculo da Média (Fora do Loop)
        // Usamos (double) para forçar a conta a ter casas decimais
        double media = (double) soma / totalNumeros;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
    }
}
