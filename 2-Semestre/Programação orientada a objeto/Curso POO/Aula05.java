public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(777);
        p1.setDono("Veigh");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(12309);
        p2.setDono("Calleri");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(200);

        p1.estadoAtual();
        p2.estadoAtual();
    }

}
