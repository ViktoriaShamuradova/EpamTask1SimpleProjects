package by.epamtc.shamuradova.task4;

public class Runner {
    private static double calcFunction(double x) {
        if (x <= 13) {
            return -Math.pow(x, 3) + 9;
        } else {
            return -(3 / (x + 1));
        }
    }

    public static void main(String[] args) {

        System.out.println(calcFunction(14));
    }
}
