public enum TipoBrinde {
    CARRO("BRINDE"),
    BONECA("BRINDE"),;

    private String descricao;

    TipoBrinde(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
