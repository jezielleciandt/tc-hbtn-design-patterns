public class NaveEspacialDecorator extends NaveEspacial {

    private NaveEspacial naveEspacial;

    public NaveEspacialDecorator(NaveEspacial naveEspecial) {
        this.naveEspacial = naveEspecial;
    }

    @Override
    public int getSaude() {
        return naveEspacial.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveEspacial.getAtaque();
    }

}
