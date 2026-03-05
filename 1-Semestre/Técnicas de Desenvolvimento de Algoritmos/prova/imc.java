
import java.util.Scanner;

//🏋️ Exercício 1: Calculadora de IMC (Simples)Objetivo: Criar uma função que recebe dados numéricos e retorna um único valor calculado.
//Enunciado:Escreva um programa que solicita ao usuário o seu peso (em kg) e sua altura (em metros).
//Crie uma função chamada calcularIMC que receba esses dois valores (float ou double) como parâmetros. 
//A função deve calcular e retornar o Índice de Massa Corporal (IMC).
//O cálculo do IMC é: $peso / (altura * altura)$.O programa principal (main) deve pegar o resultado dessa função e mostrá-lo na tela

public class imc {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu peso em Kg");
        float p = leia.nextFloat();

        System.out.println("Digite seu peso em Kg");
        float a = leia.nextFloat();

        float imc = calcularImc(p, a);

        System.out.println("O seu IMC é " + imc);

    }

    public static float calcularImc(float peso, float altura) {
        return peso / (altura * altura);

    }

}
