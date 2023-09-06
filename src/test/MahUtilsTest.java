package test;

import cz.spsmb.sec.MahUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MahUtilsTest {

    @ParameterizedTest
    @CsvSource(value = {"1,1", "2,4", "3,9", "10,100", "-1,1"})
    public void powerTest(int number, int expected) {
        Assertions.assertEquals(expected, MahUtils.power(number));
    }

    @Test
    public void isOddTest() {
        Assertions.assertEquals(true, MahUtils.isOdd(2));
        Assertions.assertEquals(false, MahUtils.isOdd(3));

    }

    @Test
    public void randomTest() {
        for (int i = 0; i < 100; i++) {
            double p = MahUtils.random(5, 10);
            Assertions.assertTrue(p >= 5 && p <= 10);
        }
    }
}