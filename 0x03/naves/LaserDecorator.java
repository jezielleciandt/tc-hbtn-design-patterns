public class LaserDecorator extends NaveEspacialDecorator {
    public LaserDecorator(NaveEspacial naveEspecial) {
        super(naveEspecial);
    }
    @Override
    public int getAtaque() {
        return super.getAtaque() + 40;
    }
}
