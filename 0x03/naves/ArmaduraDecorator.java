public class ArmaduraDecorator extends NaveEspacialDecorator {

    public ArmaduraDecorator(NaveEspacial naveEspecial) {
        super(naveEspecial);
    }

    @Override
    public int getSaude() {
        return super.getSaude() + 150;
    }
}
