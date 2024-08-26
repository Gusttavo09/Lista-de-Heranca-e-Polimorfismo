public class Zoologico {
    private Animal[] jaulas = new Animal[10];


    public void adicionarAnimais() {
        jaulas[0] = new Cachorro("xoli", 5);
        jaulas[1] = new Cavalo("PeDePano", 8);
        jaulas[2] = new Preguica("Sid", 3);
        jaulas[3] = new Cachorro("Bolt", 4);
        jaulas[4] = new Cavalo("Princess", 10);
        jaulas[5] = new Preguica("Lisa", 6);
        jaulas[6] = new Cachorro("Scooby", 7);
        jaulas[7] = new Cavalo("Flash", 9);
        jaulas[8] = new Preguica("lerda", 4);
        jaulas[9] = new Cachorro("thor", 3);
    }


    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            animal.emitirSom();
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).correr();
            } else if (animal instanceof Cavalo) {
                ((Cavalo) animal).correr();
            } else if (animal instanceof Preguica) {
                ((Preguica) animal).subirArvore();
            }
        }
    }
}