package coverter;

import rate.CurrencyRate;

public class Convert {
    public double convert(int oldCurrncy, int newCurrncy, double amount) {
        double rate = CurrencyRate.getRate(oldCurrncy, newCurrncy);
        return amount * rate;
    }
}