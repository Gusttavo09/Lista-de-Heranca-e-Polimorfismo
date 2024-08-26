public class Gerente extends Funcionario {
    private static final double ADICIONAL = 1500.00;
    private static final double COMISSAO = 1500.00;

    public Gerente(String nome, String codigoFuncional) {
        super(nome, codigoFuncional, 3000);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + ADICIONAL;
    }

    @Override
    public String toString() {
        return super.toString() + ", Comissão: R$ " + COMISSAO + ", Salário Total: R$ " + calcularSalario();
    }
}