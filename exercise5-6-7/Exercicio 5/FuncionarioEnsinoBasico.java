class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasica;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasica) {
        super(nome, codigoFuncional);
        this.escolaBasica = escolaBasica;
    }

    public String getEscolaBasica() {
        return escolaBasica;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Básica: " + escolaBasica;
    }
}
