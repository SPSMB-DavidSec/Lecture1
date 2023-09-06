package cz.spsmb.sec;

public class MahUtils {
    /**
     * Funkce vrací druhou mocninu čísla v parametru
     *
     * @param number základ druhé mocniny
     * @return doube druhá mocnina čísla z vloženého parametru
     */
    public static double power(int number) {
        return Math.pow(number, 2);
    }

    /**
     * Výpočet obvodu kružnice
     *
     * @param r poloměr
     * @return double obvod kružnice
     */
    public static double circle(int r) {
        return Math.PI * MahUtils.power(r);
    }

    /**
     * Metoda frací faktorial čísla n
     *
     * @param number hodnota pro faktoriál z intervalu(1,20)
     * @return long faktoriál
     * @throws Exception pokud je na vtupu záporné číslo, nebo číslo větší než 20
     */
    public static long factorial(int number) throws Exception {
        if (number > 0 && number < 20) {
            long output = 1;
            for (int i = 1; i <= number; i++) {
                output *= i;
            }
            return output;
        } else {
            throw new Exception("Number must be larger than zero.");
        }
    }

    /**
     * Metoda ověří zda je číslo sudé
     *
     * @param number číslo
     * @return boolean true pokud je sudé, nebo false pokud je liché.
     */
    public static boolean isOdd(int number) {
        return number % 2 == 0;
    }


    /**
     * Metoda ověří, pokud je zadané číslo porvočíslo.
     * @param number číslo
     * @return boolean true pokud je porvočíslo, jinak false
     */
    public static boolean isPrimeNumber(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static double random(int min, int max){
        double range = max - min;
        return Math.random()*range + min;
    }


}
