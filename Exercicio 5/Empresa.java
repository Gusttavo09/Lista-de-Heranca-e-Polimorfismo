public class Empresa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Gustavo", 101);
        FuncionarioEnsinoBasico f2 = new FuncionarioEnsinoBasico("Maria", 102, "Escola Primária A");
        FuncionarioEnsinoMedio f3 = new FuncionarioEnsinoMedio("Carlos", 103, "Escola Primária B", "Escola Secundária C");
        FuncionarioGraduado f4 = new FuncionarioGraduado("Joaquina", 104, "Escola Primária D", "Escola Secundária E", "Universidade F");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
    }
}