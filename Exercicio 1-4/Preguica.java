public class Preguica implements Animal {
    private String nome;
    private int idade;

    public Preguica(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de preguiça");
    }

    public void subirArvore() {
        System.out.println("Preguiça está subindo em árvores.");
    }
}
