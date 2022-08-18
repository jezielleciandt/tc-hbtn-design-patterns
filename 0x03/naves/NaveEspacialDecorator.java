public class NaveEspacialDecorator extends NaveEspacial {

    private NaveEspacial naveDecorada;

    public NaveEspacialDecorator(NaveEspacial naveEspecial) {
        this.naveDecorada = naveEspecial;
    }

    @Override
    public int getSaude() {
        return naveDecorada.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveDecorada.getAtaque();
    }

}
