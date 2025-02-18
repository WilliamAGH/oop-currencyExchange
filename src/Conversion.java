import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Lab 1: Currency Conversion Program
 * This program converts between different currencies using predefined exchange rates.
 *
 * @author William Callahan (Partner 1 below)
 * @author Shun Lett Pyae Oo (Partner 2 below)
 */

public class Conversion {

    // Conversion rates (Partner 1: EUR to USD, USD to EUR)
    static final double EUR_TO_USD = 1.05;
    static final double USD_TO_EUR = 1 / 1.05;

    // Conversion rates (Partner 2: MMK to USD, USD to MMK)
    static final double MMK_TO_USD = 0.0004766; // 1 MMK = 0.0004766 USD
    static final double USD_TO_MMK = 2098; // 1 USD = 2,098 MMK

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = menu(); // Get menu choice

        if (choice >= 1 && choice <= 4) {
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            double result = 0.0;
            String fromCurrency = "";
            String toCurrency = "";

            switch (choice) {
                case 1: // Partner 1: EUR to USD
                    result = roundToTwoDecimals(eurToUsd(amount));
                    fromCurrency = "EUR";
                    toCurrency = "USD";
                    break;
                case 2: // Partner 1: USD to EUR
                    result = roundToTwoDecimals(usdToEur(amount));
                    fromCurrency = "USD";
                    toCurrency = "EUR";
                    break;
                case 3: // Partner 2: MMK to USD
                    result = roundToTwoDecimals(mmkToUsd(amount));
                    fromCurrency = "MMK";
                    toCurrency = "USD";
                    break;
                case 4: // Partner 2: USD to MMK
                    result = roundToTwoDecimals(usdToMmk(amount));
                    fromCurrency = "USD";
                    toCurrency = "MMK";
            }

            NumberFormat formatter = NumberFormat.getInstance(Locale.US);
            formatter.setMinimumFractionDigits(2);
            formatter.setMaximumFractionDigits(2);
            System.out.printf("Converted Amount: %s %s -> %s %s\n",
                    formatter.format(amount), fromCurrency,
                    formatter.format(result), toCurrency);
        }

        System.out.println("Exiting program. Goodbye!");
        scanner.close();
    }

    /**
     * Converts EUR to USD.
     * @param amount Amount in EUR
     * @return Equivalent amount in USD (calculated to six decimal places)
     */
    public static double eurToUsd(double amount) {
        return Math.round(amount * EUR_TO_USD * 1_000_000) / 1_000_000.0;
    }

    /**
     * Converts USD to EUR.
     * @param amount Amount in USD
     * @return Equivalent amount in EUR (calculated to six decimal places)
     */
    public static double usdToEur(double amount) {
        return Math.round(amount * USD_TO_EUR * 1_000_000) / 1_000_000.0;
    }

    // Partner 2: Implement the following methods and define constants for another currency

    /**
     * Converts MMK to USD.
     * @param amount Amount in MMK
     * @return Equivalent amount in USD (calculated to six decimal places)
     */
    public static double mmkToUsd(double amount) {
        return Math.round(amount * MMK_TO_USD * 1_000_000) / 1_000_000.0;
    }

    /**
     * Converts USD to MMK.
     * @param amount Amount in USD
     * @return Equivalent amount in MMK (calculated to six decimal places)
     */
    public static double usdToMmk(double amount) {
        return Math.round(amount * USD_TO_MMK * 1_000_000) / 1_000_000.0;
    }

    /**
     * Rounds a value to two decimal places for output.
     * @param value The calculated amount
     * @return The amount rounded to two decimal places
     */
    public static double roundToTwoDecimals(double value) {
        return Math.round(value * 100) / 100.0;
    }


    /**
     * Displays a menu allowing the user to select a conversion type.
     * Uses arrow key navigation or number input.
     * @return User's menu choice.
     */
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select conversion type:");
        System.out.println("1. EUR -> USD");
        System.out.println("2. USD -> EUR");
        System.out.println("3. MMK -> USD");
        System.out.println("4. USD -> MMK");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");

        return scanner.nextInt();
    }
}
