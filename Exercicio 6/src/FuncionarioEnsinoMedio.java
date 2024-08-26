class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private final String escolaMedia;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaBasica, String escolaMedia) {
        super(nome, codigoFuncional, escolaBasica);
        this.escolaMedia = escolaMedia;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.50;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Média: " + escolaMedia;
    }
}