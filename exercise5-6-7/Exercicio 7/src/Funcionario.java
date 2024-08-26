class Funcionario {
    private final String nome;
    private final int codigoFuncional;
    protected double rendaBasica = 1000.00;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public double calcularRendaTotal() {
        return rendaBasica;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Código Funcional: " + codigoFuncional + ", Renda Total: R$ " + calcularRendaTotal();
    }
}