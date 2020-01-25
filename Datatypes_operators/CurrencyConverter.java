package Datatypes_operators;

public class CurrencyConverter {
    public static void main(String[] args) {
        double rupee = 34.5;
        double USD = 56;
        System.out.println("Rupee: " + rupee + " can be exchanged to USD: " + RupeeToUSD(rupee)
                + ", or Pound: " + RupeeToPound(rupee));
        System.out.println("USD: " + USD + " can be exchanged to Pound: " + USDToPound(USD)
                + ", or Rupee: " + USDToRupee(USD));
    }

    private static double RupeeToUSD(double RupeeAmount) {
        double exchangeRate = 0.01403;
        return RupeeAmount * exchangeRate;
    }
    private static double RupeeToPound(double RupeeAmount) {
        double exchangeRate = 0.01069;
        return RupeeAmount * exchangeRate;
    }
    private static double USDToPound(double USDAmount) {
        double exchangeRate = 0.76188;
        return USDAmount * exchangeRate;
    }
    private static double USDToRupee(double USDAmount) {
        double exchangeRate = 71.1468;
        return USDAmount * exchangeRate;
    }
}
