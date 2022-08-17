import java.util.List;

public class BebidaDecorator extends Bebida{

    private Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebida) {
        this.bebidaDecorada = bebida;
    }

    public Bebida getBebidaDecorada() {
        return bebidaDecorada;
    }

    public void setBebidaDecorada(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }
    @Override
    List<String> obterIngredientes() {
        return bebidaDecorada.obterIngredientes();
    }

    @Override
    double obterPreco() {
        return bebidaDecorada.obterPreco();
    }
}