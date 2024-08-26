public class Vendedor extends Funcionario {
    private static final double ADICIONAL = 250.00;
    private static final double COMISSAO = 250.00;

    public Vendedor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional, 1500);
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