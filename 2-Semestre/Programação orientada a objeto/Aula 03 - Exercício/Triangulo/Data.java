
public class Data {
    // Atributos
    public int dia;
    public int mes;
    public int ano;

    // Construtor vazio
    public Data() {
    }

    // Construtor com parâmetros
    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void cadastraDados(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void imprimeData() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }
}