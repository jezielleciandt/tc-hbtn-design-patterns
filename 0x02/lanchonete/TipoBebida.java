public enum TipoBebida {
    SUCO("BEBIDA"),
    GUARANA("BEBIDA"),
    COCA_COLA("BEBIDA");

    private String descricao;

    TipoBebida(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
