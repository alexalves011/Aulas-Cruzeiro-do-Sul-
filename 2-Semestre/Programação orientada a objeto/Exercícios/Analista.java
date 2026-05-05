public class Analista extends Empregado {
    private float[] valorPorProjeto;

    public Analista() {
    }

    public Analista(String n, String m, float[] vP) {
        super(n, m); // Chama o construtor da classe pai
        this.valorPorProjeto = vP;
    }

    @Override
    public float calculaSalario() {
        float total = 0;
        for (float valor : valorPorProjeto) {
            total += valor;
        }
        return total;
    }

    // Métodos de acesso
    public float[] getValorPorProjeto() { return valorPorProjeto; }
    public void setValorPorProjeto(float[] valorPorProjeto) { this.valorPorProjeto = valorPorProjeto; }
}