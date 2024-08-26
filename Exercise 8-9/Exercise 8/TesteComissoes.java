public class TesteComissoes {
    public static void main(String[] args) {
        Comissao gerente = new Gerente();
        Comissao supervisor = new Supervisor();
        Comissao vendedor = new Vendedor();

        System.out.println("Comissão do Gerente: R$" + gerente.getValorAdicional());
        System.out.println("Comissão do Supervisor: R$" + supervisor.getValorAdicional());
        System.out.println("Comissão do Vendedor: R$" + vendedor.getValorAdicional());
    }
}