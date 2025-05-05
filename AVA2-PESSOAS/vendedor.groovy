public class Vendedor extends Empregado {
    private double comissao;

    public Vendedor(String nome, String cpf, String dataNascimento, String telefone, String endereco,
                    String matricula, String cargo, double salario, double comissao) {
        super(nome, cpf, dataNascimento, telefone, endereco, matricula, cargo, salario);
        this.comissao = comissao;
    }

    public double getComissao() { return comissao; }
    public void setComissao(double comissao) { this.comissao = comissao; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Comissão: R$" + comissao);
    }
}
