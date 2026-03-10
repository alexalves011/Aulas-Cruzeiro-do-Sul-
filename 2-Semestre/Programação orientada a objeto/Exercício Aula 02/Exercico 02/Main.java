import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Produto 1 (construtor padrão) ===");
        Produto produto1 = new Produto();
        System.out.print("Marca: ");
        produto1.setMarca(scanner.nextLine());
        System.out.print("Fabricante: ");
        produto1.setFabricante(scanner.nextLine());
        System.out.print("Código de barras: ");
        produto1.setCodBarras(scanner.nextLine());
        System.out.print("Preço: ");
        produto1.setPreco(Float.parseFloat(scanner.nextLine()));

        System.out.println();
        System.out.println("=== Produto 2 (construtor com parâmetros) ===");
        System.out.print("Marca: ");
        String marca2 = scanner.nextLine();
        System.out.print("Fabricante: ");
        String fabricante2 = scanner.nextLine();
        System.out.print("Código de barras: ");
        String codBarras2 = scanner.nextLine();
        System.out.print("Preço: ");
        float preco2 = Float.parseFloat(scanner.nextLine());

        Produto produto2 = new Produto(marca2, fabricante2, codBarras2, preco2);

        System.out.println();
        System.out.println("=== Dados do Produto 1 ===");
        System.out.println(produto1);

        System.out.println("=== Dados do Produto 2 ===");
        System.out.println(produto2);

        scanner.close();
    }
}
