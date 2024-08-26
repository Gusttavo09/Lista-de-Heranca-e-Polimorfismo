public class TesteFuncionario {
    public static void main(String[] args) {
        // Criar comissões
        Comissao comissaoGerente = new Gerente();
        Comissao comissaoSupervisor = new Supervisor();
        Comissao comissaoVendedor = new Vendedor();

        // Criar funcionários
        Funcionario funcionarioGerente = new Funcionario("Carlos", 5000.00, comissaoGerente);
        Funcionario funcionarioSupervisor = new Funcionario("Ana", 3000.00, comissaoSupervisor);
        Funcionario funcionarioVendedor = new Funcionario("João", 2000.00, comissaoVendedor);

        // Calcular e imprimir salários
        System.out.println("Salário total do Gerente: R$" + funcionarioGerente.calcularSalario());
        System.out.println("Salário total do Supervisor: R$" + funcionarioSupervisor.calcularSalario());
        System.out.println("Salário total do Vendedor: R$" + funcionarioVendedor.calcularSalario());
    }
}
