public class Jogador {

    private String nome;
    private int gols;

    public Jogador(String nome) {
        this.nome = nome;
        this.gols = 0;
    }

    public void marcarGol() {
        gols++;
    }

    public String getNome() {
        return nome;
    }

    public int getGols() {
        return gols;
    }

    public boolean isArtilheiro() {
        return gols >= 3;
    }
}