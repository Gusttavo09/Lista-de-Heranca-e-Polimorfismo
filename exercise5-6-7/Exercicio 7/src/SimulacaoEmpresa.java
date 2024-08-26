public class SimulacaoEmpresa {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[10];


        funcionarios[0] = new FuncionarioEnsinoBasico("Funcionario 1", 101, "Escola Primária A");
        funcionarios[1] = new FuncionarioEnsinoBasico("Funcionario 2", 102, "Escola Primária B");
        funcionarios[2] = new FuncionarioEnsinoBasico("Funcionario 3 ", 103, "Escola Primária C");
        funcionarios[3] = new FuncionarioEnsinoBasico("Funcionario 4", 104, "Escola Primária D");

        funcionarios[4] = new FuncionarioEnsinoMedio("Funcionario 5", 105, "Escola Primária E", "Escola Secundária F");
        funcionarios[5] = new FuncionarioEnsinoMedio("Funcionario 6", 106, "Escola Primária G", "Escola Secundária H");
        funcionarios[6] = new FuncionarioEnsinoMedio("Funcionario 7", 107, "Escola Primária I", "Escola Secundária J");
        funcionarios[7] = new FuncionarioEnsinoMedio("Funcionario 8", 108, "Escola Primária K", "Escola Secundária L");

        funcionarios[8] = new FuncionarioGraduado("Funcionario 9", 109, "Escola Primária M", "Escola Secundária N", "Universidade O");
        funcionarios[9] = new FuncionarioGraduado("Funcionario 10", 110, "Escola Primária P", "Escola Secundária Q", "Universidade R");


        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;


        for (Funcionario f : funcionarios) {
            double renda = f.calcularRendaTotal();
            custoTotal += renda;

            if (f instanceof FuncionarioEnsinoBasico && !(f instanceof FuncionarioEnsinoMedio)) {
                custoEnsinoBasico += renda;
            } else if (f instanceof FuncionarioEnsinoMedio && !(f instanceof FuncionarioGraduado)) {
                custoEnsinoMedio += renda;
            } else if (f instanceof FuncionarioGraduado) {
                custoGraduacao += renda;
            }
        }


        System.out.println("Custo total com salários: R$ " + custoTotal);
        System.out.println("Custo com funcionários de ensino básico: R$ " + custoEnsinoBasico);
        System.out.println("Custo com funcionários de ensino médio: R$ " + custoEnsinoMedio);
        System.out.println("Custo com funcionários de nível superior: R$ " + custoGraduacao);
    }
}
