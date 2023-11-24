import java.util.Scanner;

public class Question2 {
    private static String[] currencies = {"USD", "PKR", "Pound", "Dirham", "INR", "BDT", "JPY"};
    private static double[] exchangeRates = {1.0, 236.0, 0.88, 3.67, 79.0, 104.0, 142.0};

    public static double convert(String fromCurrency, double amount, String toCurrency) {
        int fromIndex = -1;
        int toIndex = -1;

        // Find the indices of the fromCurrency and toCurrency in the currencies array
        for (int i = 0; i < currencies.length; i++) {
            if (currencies[i].equalsIgnoreCase(fromCurrency)) {
                fromIndex = i;
            }
            if (currencies[i].equalsIgnoreCase(toCurrency)) {
                toIndex = i;
            }
        }

        if (fromIndex == -1 || toIndex == -1) {
            throw new IllegalArgumentException("Unsupported currency.");
        }

        double fromRate = exchangeRates[fromIndex];
        double toRate = exchangeRates[toIndex];

        return (amount / fromRate) * toRate;
    }

    public static void main(String[] args) {
        double convertedAmount = Question2.convert("USD", 50, "INR");
        System.out.println("50 USD is approximately " + convertedAmount + " INR");
    }
}