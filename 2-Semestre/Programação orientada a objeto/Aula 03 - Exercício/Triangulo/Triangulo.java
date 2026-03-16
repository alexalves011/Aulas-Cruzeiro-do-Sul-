
public class Triangulo {
    // Atributos
    public float base;
    public float altura;

    // Construtor vazio
    public Triangulo() {
    }

    // Construtor com parâmetros
    public Triangulo(float b, float a) {
        this.base = b;
        this.altura = a;
    }

    // Método para calcular área
    public float calculaArea() {
        return (base * altura) / 2;
    }

    // Método para imprimir
    public void imprimeDados() {
        System.out.println("Triângulo -> Base: " + base + " | Altura: " + altura + " | Área: " + calculaArea());
    }
}