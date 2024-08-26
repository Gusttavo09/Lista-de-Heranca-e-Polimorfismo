import java.util.Random;

public class Empresa {
    public static void main(String[] args) {
        final int NUM_FUNCIONARIOS = 10;
        Funcionario[] funcionarios = new Funcionario[NUM_FUNCIONARIOS];
        Random random = new Random();


        int numGerentes = NUM_FUNCIONARIOS / 10;
        int numSupervisores = NUM_FUNCIONARIOS / 5;
        int numVendedores = NUM_FUNCIONARIOS - numGerentes - numSupervisores;

        for (int i = 0; i < NUM_FUNCIONARIOS; i++) {
            String nome = "Funcionario " + (i + 1);
            String codigoFuncional = "C" + (i + 1);

            if (i < numGerentes) {
                funcionarios[i] = new Gerente(nome, codigoFuncional);
            } else if (i < numGerentes + numSupervisores) {
                funcionarios[i] = new Supervisor(nome, codigoFuncional);
            } else {
                funcionarios[i] = new Vendedor(nome, codigoFuncional);
            }
        }


        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}