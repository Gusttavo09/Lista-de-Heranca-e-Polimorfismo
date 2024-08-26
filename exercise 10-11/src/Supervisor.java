public class Supervisor extends Funcionario {
    private static final double ADICIONAL = 600.00;
    private static final double COMISSAO = 600.00;

    public Supervisor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional, 2000);
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