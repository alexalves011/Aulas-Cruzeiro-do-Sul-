public class Login {
    private String nome;
    private String acesso;
    private String password;
    private String[] users = {"admin", "professor", "aluno", "coordenador"};
    
    // Construtor vazio
    public Login() {
        this.nome = "";
        this.password = "";
        this.acesso = "";
    }
    
    // Construtor com parâmetros
    public Login(String nome, String password) {
        this.nome = nome;
        this.password = password;
        this.acesso = "";
    }
    
    // Método de autenticação
    public boolean autentica() {
        // Verifica se o nome de usuário existe no array
        for(int i = 0; i < users.length; i++) {
            if(users[i].equals(nome)) {
                // Simula validação de senha
                if(password.length() >= 4) {
                    this.acesso = "Acesso nível " + (i+1);
                    return true;
                }
            }
        }
        return false;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public String getAcesso() {
        return acesso;
    }
    
    public String getPassword() {
        return password;
    }
}
