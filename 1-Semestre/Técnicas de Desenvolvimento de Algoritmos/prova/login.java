import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String login;
        int senha;

        System.out.println("LOGIN");

        System.out.println("Digite seu Login");
        // CORREÇÃO 1: Trocado nextString() por next()
        login = leitor.next(); 

        System.out.println("Digite sua senha");
        senha = leitor.nextInt();

        // CORREÇÃO 2: Trocado == por .equals() para comparar Strings
        // (Também corrigi o provável erro de digitação de "adimin" para "admin")
        if (login.equals("admin") && senha == 1234) {
            System.out.println("Login bem-sucedido");
        } else {
            System.out.println("Senha ou Usuario Incorreto");
        }
    }
}