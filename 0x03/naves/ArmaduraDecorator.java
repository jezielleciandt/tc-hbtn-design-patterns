public class ArmaduraDecorator extends NaveEspacialDecorador {

    public ArmaduraDecorator(NaveEspacial naveEspecial) {
        super(naveEspecial);
    }

    @Override
    public int getSaude() {
        return super.getSaude() + 150;
    }
}
