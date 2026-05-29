import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

    @Test
    public void jogadorComecaSemGols() {
        Jogador jogador = new Jogador("Ronaldo");
        assertEquals(0, jogador.getGols());
    }

    @Test
    public void marcarGolAumentaContagem() {
        Jogador jogador = new Jogador("Pelé");
        jogador.marcarGol();
        jogador.marcarGol();
        assertEquals(2, jogador.getGols());
    }

    @Test
    public void jogadorViraArtilheiroComTresGols() {
        Jogador jogador = new Jogador("Romário");
        jogador.marcarGol();
        jogador.marcarGol();
        jogador.marcarGol();
        assertTrue(jogador.isArtilheiro());
    }

    @Test
    public void jogadorComDoisGolsNaoEhArtilheiro() {
        Jogador jogador = new Jogador("Neymar");
        jogador.marcarGol();
        jogador.marcarGol();
        assertFalse(jogador.isArtilheiro());
    }
}
