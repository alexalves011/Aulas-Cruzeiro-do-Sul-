import java.util.Scanner;

public class turno {
    
public static void main (String[] args) {

Scanner leitor  = new Scanner(System.in);

String turno, mensagem;

System.out.println("Digite seu turno ('M'Matutino, 'V' Vespertino ou 'N'Noturno.)");
turno = leitor.next();

if(turno.equals("M")){
    mensagem = "Bom Dia!";
} else if (turno.equals("V")) {
    mensagem = "Boa Tarde!";
} else if (turno.equals("N")) {
    mensagem = "Boa Noite!";
} else {
    mensagem = "Valor Inválido!";
}

System.err.println(mensagem);

}


}
