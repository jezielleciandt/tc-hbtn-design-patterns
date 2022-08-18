public class NaveEspacialDecorador extends NaveEspacial {

    private NaveEspacial naveEspecial;

    public NaveEspacialDecorador(NaveEspacial naveEspecial) {
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
