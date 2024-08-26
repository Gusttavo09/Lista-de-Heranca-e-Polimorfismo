public class Funcionario {
    protected String nome;
    protected double salarioBase;
    protected Comissao comissao;


    public Funcionario(String nome, double salarioBase, Comissao comissao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }


    public double calcularSalario() {
        double salarioTotal = salarioBase;
        if (comissao != null) {
            salarioTotal += comissao.getValorAdicional();
        }
        return salarioTotal;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }
}
