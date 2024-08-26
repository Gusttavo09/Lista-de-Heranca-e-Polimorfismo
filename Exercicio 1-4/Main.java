public class Main {
    public static void main(String[] args) {

        // Exercício 01 e 02: Criação dos animais e emissão de sons polimorficamente
        Cachorro cachorro = new Cachorro("Dog", 5);
        Cavalo cavalo = new Cavalo("Spirit", 8);
        Preguica preguica = new Preguica("Sid", 3);

        Animal[] animais = {cachorro, cavalo, preguica};

        for (Animal animal : animais) {
            animal.emitirSom();
        }

        // Exercício 03: Veterinário examinando os animais
        Veterinario veterinario = new Veterinario();

        for (Animal animal : animais) {
            veterinario.examinar(animal);
        }

        // Exercício 04: Zoológico com 10 jaulas
        Zoologico zoologico = new Zoologico();
        zoologico.adicionarAnimais(); // Popula o zoológico com 10 animais
        zoologico.percorrerJaulas();  // Percorre as jaulas, emite som e faz os animais correrem
    }
}
