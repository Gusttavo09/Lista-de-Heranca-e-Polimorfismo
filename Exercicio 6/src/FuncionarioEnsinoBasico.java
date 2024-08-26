class FuncionarioEnsinoBasico extends Funcionario {
    private final String escolaBasica;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasica) {
        super(nome, codigoFuncional);
        this.escolaBasica = escolaBasica;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Básica: " + escolaBasica;
    }
}