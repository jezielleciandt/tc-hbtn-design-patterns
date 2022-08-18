public class NaveEspacialDecorator extends NaveEspacial {

    private NaveEspacial naveEspecial;

    public NaveEspacialDecorator(NaveEspacial naveEspecial) {
        this.naveEspecial = naveEspecial;
    }

    @Override
    public int getSaude() {
        return naveEspecial.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveEspecial.getAtaque();
    }

}
