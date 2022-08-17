import java.util.List;

public class BebidaComLeite extends BebidaDecorator{
    public BebidaComLeite(Bebida bebida) {
        super(bebida);
    }
    @Override
    public List<String> obterIngredientes() {
        List<String> listIngredientes = super.obterIngredientes();
        listIngredientes.add("leite");
        return listIngredientes;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}
