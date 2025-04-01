package coverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rate.CurrencyRate;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {
    private Convert converter;

    @BeforeEach
    void setUp() {
        converter = new Convert();
    }

    @Test
    void USDtoEUR_TEST1() {

        int oldCurrncy = CurrencyRate.getUSD();
        int newCurrncy = CurrencyRate.getEUR();
        double amount = 100;

        double actualResult = converter.convert(oldCurrncy, newCurrncy, amount);

        double expectedResult = 85;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void EURDtoUSD_TEST2() {

        int oldCurrncy = CurrencyRate.getEUR();
        int newCurrncy = CurrencyRate.getUSD();
        double amount = 50;

        double actualResult = converter.convert(oldCurrncy, newCurrncy, amount);

        double expectedResult = 59;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void USDtoUGX_TEST3() {
        int oldCurrncy = CurrencyRate.getUSD();
        int newCurrncy = CurrencyRate.getUGX();
        double amount = 100;

        double actualResult = converter.convert(oldCurrncy, newCurrncy, amount);
        double expectedResult = 380000;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void UGXtoUSD_TEST4() {
        int oldCurrncy = CurrencyRate.getUGX();
        int newCurrncy = CurrencyRate.getUSD();
        double amount = 250000;

        double actualResult = converter.convert(oldCurrncy, newCurrncy, amount);
        double expectedResult = 65.75;
        assertEquals(expectedResult, actualResult);
    }
}