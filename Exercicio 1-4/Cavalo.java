public class Cavalo implements Animal {
    private String nome;
    private int idade;

    public Cavalo(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void emitirSom() {
        System.out.println("Relincha");
    }

    public void correr() {
        System.out.println("Cavalo está correndo.");
    }
}
