class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedia;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaBasica, String escolaMedia) {
        super(nome, codigoFuncional, escolaBasica);
        this.escolaMedia = escolaMedia;
    }

    public String getEscolaMedia() {
        return escolaMedia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Média: " + escolaMedia;
    }
}