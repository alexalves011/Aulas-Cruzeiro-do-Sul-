// Importa a classe Scanner, que nos permite ler a entrada do usuário (via teclado).
import java.util.Scanner;

// Declara a classe pública chamada 'peso'.
public class peso {

    // Método principal (main), onde a execução do programa se inicia.
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'leia' que lê dados do sistema de entrada (System.in), ou seja, o teclado.
        Scanner leia = new Scanner(System.in);

        // Imprime uma mensagem no console, instruindo o usuário a digitar seu peso.
        System.out.println("Digite seu peso");

        // 1. Declara uma variável 'peso1' do tipo float (para números com decimais).
        // 2. O método leia.nextFloat() pausa o programa e espera o usuário digitar um número e pressionar Enter.
        // 3. O número digitado é armazenado na variável 'peso1'.
        float peso1 = leia.nextFloat();

        // Imprime o texto "Seu peso é" junto com o valor que foi armazenado na variável 'peso1'.
        System.out.println("Seu peso é" + peso1);

    } // Fim do método main

} // Fim da classe peso