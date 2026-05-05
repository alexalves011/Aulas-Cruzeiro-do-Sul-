public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Caneta(String modelo, float ponta, boolean tampada, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
        this.cor = cor;
    }

    public void status() {
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
        System.err.println("Cor: " + cor);
        System.out.println("Tampada: " + this.tampada);
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public String getCor() {
        return cor;
    }

}