import java.util.Locale;

public class Produto {
    private String marca;
    private String fabricante;
    private String codBarras;
    private float preco;

    public Produto() {
        this.marca = "";
        this.fabricante = "";
        this.codBarras = "";
        this.preco = 0.0f;
    }

    public Produto(String marca, String fabricante, String codBarras, float preco) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.codBarras = codBarras;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
                "Marca: %s\nFabricante: %s\nCódigo de barras: %s\nPreço: R$ %.2f\n",
                marca, fabricante, codBarras, preco);
    }
}
