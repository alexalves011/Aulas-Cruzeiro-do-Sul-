public class Main {
    public static void main(String[] args) {
        
        Paciente paciente1 = new Paciente();
        paciente1.setNome("Ana Silva");
        paciente1.setRg("12.345.678-9");
        paciente1.setEndereco("Rua das Flores, 123");
        paciente1.setTelefone("(11) 99999-0000");
        paciente1.setDataNascimento("01/01/1990");
        paciente1.setProfissao("Professor(a)");

    
        Paciente paciente2 = new Paciente("Bruno Souza");
        paciente2.setRg("98.765.432-1");
        paciente2.setEndereco("Av. dos Estudantes, 456");
        paciente2.setTelefone("(11) 98888-1111");
        paciente2.setDataNascimento("15/05/1985");
        paciente2.setProfissao("Engenheiro(a)");

        System.out.println("=== Dados do paciente 1 ===");
        System.out.println(paciente1);

        System.out.println("=== Dados do paciente 2 ===");
        System.out.println(paciente2);
    }
}
