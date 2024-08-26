class FuncionarioGraduado extends FuncionarioEnsinoMedio {
    private final String universidade;

    public FuncionarioGraduado(String nome, int codigoFuncional, String escolaBasica, String escolaMedia, String universidade) {
        super(nome, codigoFuncional, escolaBasica, escolaMedia);
        this.universidade = universidade;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 2.00; // Acrescenta 100% sobre a renda do ensino médio
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidade: " + universidade;
    }
}