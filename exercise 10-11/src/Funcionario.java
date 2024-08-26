public class Funcionario {
    protected String nome;
    protected String codigoFuncional;
    protected double salarioBase;

    public Funcionario(String nome, String codigoFuncional, double salarioBase) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Código: " + codigoFuncional + ", Salário Base: R$ " + salarioBase;
    }
}