public class NanoBotsDecorator extends NaveEspacialDecorador {
    public NanoBotsDecorator(NaveEspacial naveEspecial) {
        super(naveEspecial);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 25;
    }
}
