public class simulado08 {
    public static void main(String[] args) {

        // 1. Criamos a variável acumuladora começando com 0 (balde vazio)
        int soma = 0;

        // 2. O loop vai de 1 até 10
        for (int i = 1; i <= 10; i++) {
            
            // 3. Somamos o valor atual de 'i' dentro da variável 'soma'
            soma = soma + i;
            // Dica: Você também pode escrever: soma += i;
        }

        // 4. Imprimimos o resultado SÓ DEPOIS que o loop acabar
        System.out.println("A soma total de 1 a 10 é: " + soma);
    }
}