public enum TipoLanche {
    HAMBURGUER("LANCHE"),
    CHEESEBURGUER("LANCHE");

    private String descricao;

    TipoLanche(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
