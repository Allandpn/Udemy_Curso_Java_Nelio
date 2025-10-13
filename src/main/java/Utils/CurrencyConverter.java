package Utils;



public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double calculaValorCompra(double dollar_price, double dollar_qnt){
        return (dollar_price * dollar_qnt) * (1 + IOF);
    }

}
