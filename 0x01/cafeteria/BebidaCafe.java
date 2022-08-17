import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BebidaCafe extends Bebida{
    @Override
    List<String> obterIngredientes() {

        return new ArrayList<String>(Arrays.asList("cafe"));
    }

    @Override
    double obterPreco() {
        return 5.35;
    }
}
