package cz.spsmb.sec;

public class Main {

    public static void main(String[] args) {
        double power = MahUtils.power(10);
        System.out.println(power);
        System.out.println(MahUtils.circle(6));
        try {
            System.out.println(MahUtils.factorial(20));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(MahUtils.random(5,10));
    }
}
