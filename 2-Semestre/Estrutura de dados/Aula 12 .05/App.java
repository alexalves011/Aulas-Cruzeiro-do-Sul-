public class App {

    public static void main(String[] args) {
        Fila f = new Fila(5);
        f.insere(100);
        f.insere(20);

        System.out.println(f.remove());
        System.out.println(f.remove());
        System.out.println(f.printElementos());

    }

}
