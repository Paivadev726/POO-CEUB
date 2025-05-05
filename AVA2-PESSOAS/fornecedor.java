public class Fornecedor extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public Fornecedor(String nome, String cpf, String dataNascimento, String telefone, String endereco,
                      String cnpj, String razaoSocial) {
        super(nome, cpf, dataNascimento, telefone, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
    }
}
