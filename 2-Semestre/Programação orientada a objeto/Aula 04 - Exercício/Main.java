public class Main{

    public static void main(String[] args) {

        

        // Objeto 1: Usando o construtor vazio

        Curso curso1 = new Curso();

        curso1.nome = "Engenharia de Software";

        curso1.quantidadealunos = 40;

        curso1.turma = "A1";

        curso1.mensalidade = 1200.50f;



        // Objeto 2: Usando o construtor com parâmetros (Mais rápido!)

        Curso curso2 = new Curso("Ciência da Computação", 30, "B2", 1500.00f);



        // Testando os métodos para o Curso 1

        System.out.println("--- Dados do Curso 1 ---");

        curso1.cadastraCurso();

        curso1.imprimeDados();

        System.out.println("Total Mensalidade: R$ " + curso1.calculaTotalMensalidade());



        System.out.println("\n--- Dados do Curso 2 ---");

        // Testando os métodos para o Curso 2

        curso2.imprimeDados();

        System.out.println("Total Mensalidade: R$ " + curso2.calculaTotalMensalidade());

    }

}