public class NanoBotsDecorator extends NaveEspacialDecorator {
    public NanoBotsDecorator(NaveEspacial naveEspecial) {
        super(naveEspecial);
    }

    @Override
    public int getAtaque() {
        return super.getAtaque() + 25;
    }
}
