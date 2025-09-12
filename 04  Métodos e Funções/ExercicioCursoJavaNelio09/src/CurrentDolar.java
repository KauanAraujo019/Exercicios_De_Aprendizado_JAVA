public class CurrentDolar {
    public static double dolarAtual;
    public static double dolarQuantidade;
    public static final double TAXAIOF = 6.00 / 100 ;


    public static double dolarConversion(){
        double taxaDolar = dolarAtual * dolarQuantidade * TAXAIOF;
        return dolarAtual * dolarQuantidade + taxaDolar;
    }


}