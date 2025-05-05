public class Usuario extends Pessoa {
    private String usuario;
    private String senha;
    private int nivelAcesso;

    public Usuario(String nome, String cpf, String dataNascimento, String telefone, String endereco,
                   String usuario, String senha, int nivelAcesso) {
        super(nome, cpf, dataNascimento, telefone, endereco);
        this.usuario = usuario;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public int getNivelAcesso() { return nivelAcesso; }
    public void setNivelAcesso(int nivelAcesso) { this.nivelAcesso = nivelAcesso; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Usuário: " + usuario);
        System.out.println("Nível de Acesso: " + nivelAcesso);
    }
}
