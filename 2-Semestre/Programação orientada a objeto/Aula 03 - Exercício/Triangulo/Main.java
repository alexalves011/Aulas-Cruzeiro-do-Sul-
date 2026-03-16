
public class Main {
    public static void main(String[] args) {
        // --- Testando Triângulos ---
        // Objeto 1 usando construtor com parâmetros
        Triangulo t1 = new Triangulo(10.5f, 5.0f);
        
        // Objeto 2 usando construtor vazio e depois atribuindo valores
        Triangulo t2 = new Triangulo();
        t2.base = 8.0f;
        t2.altura = 4.0f;

        t1.imprimeDados();
        t2.imprimeDados();

        System.out.println("--------------------");

        // --- Testando Datas ---
        // Objeto 1 usando construtor com parâmetros
        Data d1 = new Data(15, 3, 2026);
        
        // Objeto 2 usando construtor vazio e método cadastraDados
        Data d2 = new Data();
        d2.cadastraDados(25, 12, 2025);

        d1.imprimeData();
        d2.imprimeData();
    }
}