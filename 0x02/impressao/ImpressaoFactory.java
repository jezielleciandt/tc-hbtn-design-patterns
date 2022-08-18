public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPg, int totalPgColorida, boolean ehFreteVerso){
        return  new Impressao(tamanhoImpressao, totalPg, totalPgColorida, ehFreteVerso);
    }
}
