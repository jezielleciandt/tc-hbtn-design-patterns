public class LaserDecorator extends NaveEspacialDecorador {
    public LaserDecorator(NaveEspacial naveEspecial) {
        super(naveEspecial);
    }
    @Override
    public int getAtaque() {
        return super.getAtaque() + 40;
    }
}
