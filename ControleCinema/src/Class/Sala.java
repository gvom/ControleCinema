package Class;

public class Sala {

    private final int codSala;

    private final int capacidade;

    public Sala(int codSala, int capacidade) {
        this.codSala = codSala;
        this.capacidade = capacidade;
    }

    public int getCodSala() {
        return codSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

}
