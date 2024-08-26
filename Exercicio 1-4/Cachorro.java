public class Cachorro implements Animal {
    private String nome;
    private int idade;

    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void correr() {
        System.out.println("Cachorro está correndo.");
    }
}
