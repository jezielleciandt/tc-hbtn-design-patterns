public class CanhaoExtraDecorator extends NaveEspacialDecorador {


    public CanhaoExtraDecorator(NaveEspacial naveEspecial) {
        super(naveEspecial);
    }


    @Override
    public int getAtaque() {
        return super.getAtaque() + 75;
    }
}
