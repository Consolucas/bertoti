import java.util.ArrayList;
import java.util.List;

public class Adega {
    private List<Bebida> bebidas = new ArrayList<>();

    public Adega(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public Adega() {
    }


    public void adicionarBebida(Bebida bebida){
        bebidas.add(bebida);
    }
}
