package rate;
public class CurrencyRate {
    private static final int USD = 1;
    private static final int EUR = 2;
    private static final int UGX = 3;

    public static double getRate(int from, int to) {
        if (from == to) {
            return 1.0;
        }

        if (from == USD && to == EUR) return 0.85;
        if (from == EUR && to == USD) return 1.18;
        if (from == USD && to == UGX) return 3800;
        if (from == UGX && to == USD) return 0.000263;

        return 0.0;
    }


    public static int getUSD() {
        return USD;
    }

    public static int getEUR() {
        return EUR;
    }

    public static int getUGX() {
        return UGX;
    }
}