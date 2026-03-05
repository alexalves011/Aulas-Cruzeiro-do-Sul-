import java.util.Scanner;

public class exeprova01 {

    public static void main(String[] args) {

        // for (int i = 0; i <= 100; i++) {

        // Verifica se o resto da divisão por 2 é zero
        // if (i % 2 == 0) {
        // }
        // }

        // int i = 0; // 1. INICIALIZAÇÃO: Começa "i" fora do loop

        // while (i <= 100) { // 2. CONDIÇÃO: O loop continua enquanto "i" for menor ou
        // igual a 100

        // Lógica principal
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }

        // }

        // for (int i = 0; i <= 50; i++){
        // System.out.println(i);
        // }

        // System.out.println("--------------------------------------------------------------------------------------------");

        // for (int i = 51; i <= 100; i = i + 2){
        // System.out.println(i);
        // }

        Scanner leitor = new Scanner(System.in);

        // System.out.println("Digite um número (n):");
        // int n = leitor.nextInt();

        // 1. A variável da soma (S) precisa ser 'double' para guardar números decimais.
        // Ela deve começar em 0.
        // double s = 0.0;

        // for (int i = 1; i <= n; i++) {

        // 3. Em cada volta do loop, adicionamos a fração (1.0 / i) à soma
        // Usamos "1.0" para forçar a divisão decimal!
        // s = s + (1.0 / i);

        // Você pode ver o cálculo passo a passo se quiser:
        // System.out.println("Somando " + (1.0 / i) + ", S agora é " + s);
        // }

        // 4. Imprime o resultado final (depois que o loop terminar)
        // System.out.println("Quantos números você quer digitar?");
        // int qtd = leitor.nextInt();

        // 2. Declara a soma FORA do loop, começando em 0
        // (Precisa ser double para a média)
        // double soma = 0.0;

        // 3. Loop "PARA" (for) que roda 'qtd' vezes
        // (i = 0, i = 1, i = 2... até i = qtd - 1)
        // for (int i = 0; i < qtd; i++) {

        // 4. Pede um valor DENTRO do loop
        // System.out.println("Digite o valor " + (i + 1) + ":");
        // double valor = leitor.nextDouble(); // Lê o valor do usuário

        // 5. Acumula o valor na soma
        // soma = soma + valor;
        // }

        // 6. Calcula a média DEPOIS que o loop terminar
        // double media = soma / qtd;

        // 7. Imprime o resultado final
        // System.out.println("A soma total é: " + soma);
        // System.out.println("A média é: " + media);

        double somaAlturaMulheres = 0.0;
        int contMulheres = 0;
        double somaAlturaHomens = 0.0;
        int contHomens = 0;

        while (true) {
            
            // PASSO 3: Pedir a altura
            System.out.print("Digite a altura (em metros, ex: 1.75) (ou 0 para parar): ");
            double altura = leitor.nextDouble();

            // PASSO 4: Verificar a parada
            if (altura == 0) {
                break; // Sai do loop
            }

            // PASSO 5: Pedir o sexo
            System.out.print("Digite o sexo (M/F): ");
            // Pega a primeira letra (char) da palavra que o usuário digitar
            char sexo = leitor.next().charAt(0); 

            // PASSO 6: Acumular os dados
            if (sexo == 'F' || sexo == 'f') {
                somaAlturaMulheres = somaAlturaMulheres + altura;
                contMulheres++; // contMulheres = contMulheres + 1;
            } 
            else if (sexo == 'M' || sexo == 'm') {
                somaAlturaHomens = somaAlturaHomens + altura;
                contHomens++;
            } 
            else {
                System.out.println("Sexo inválido. Dados ignorados.");
            }
            
            System.out.println("--- Próxima pessoa ---");
        } // O loop volta para o Passo 3

        
        System.out.println("\n--- CÁLCULO FINALIZADO ---");

        // PASSO 7: Calcular as médias (Fora do loop)
        
        // Média das mulheres
        if (contMulheres > 0) {
            double mediaMulheres = somaAlturaMulheres / contMulheres;
            // PASSO 8 (Mulheres)
            System.out.println("Média da altura das mulheres: " + String.format("%.2f", mediaMulheres) + " m");
        } else {
            System.out.println("Nenhuma mulher foi registrada.");
        }

        // Média dos homens
        if (contHomens > 0) {
            double mediaHomens = somaAlturaHomens / contHomens;
            // PASSO 8 (Homens)
            System.out.println("Média da altura dos homens: " + String.format("%.2f", mediaHomens) + " m");
        } else {
            System.out.println("Nenhum homem foi registrado.");
        }

    }
}
