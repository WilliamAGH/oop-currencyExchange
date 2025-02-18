import java.util.Scanner;

/**
 * Lab 1: Currency Exchange Program
 * @author William Callahan
 * @author Shun Lett Pyae Oo
 */

public class Conversion {
    static final double MMK_TO_USD = 0.0004766; // 1 MMK = 0.0004766 USD
    static final double USD_TO_MMK = 2098; // 1 USD = 2,098 MMK

    /**
     * This method receives an amount in myanmar kyats and returns the corresponding amount in dollar
     * @param amount in myanmar kyats
     * @return amount in dollar
     */

    public static double convertMyanmarKyatsToDollar(double amount) {

        return (amount*MMK_TO_USD);
    }

    /**
     * This method receives an amount in dollar and returns the corresponding amount in myanmar kyats
     * @param amount in dollar
     * @return amount in myanmar kyats
     */

    public static double convertDollarToMyanmarKyats(double amount) {

        return (amount*USD_TO_MMK);
    }

    /**
     * This is a menu display for user
     * @return user-selected menu option
     */

    public static int menu(Scanner in) {
        System.out.println("1. Myanmar Kyats -> US Dollar");
        System.out.println("2. US Dollar -> Myanmar Kyats");
        System.out.println("3. Euro -> US Dollar");
        System.out.println("4. US Dollar -> Euro");
        System.out.println("5. End the program.");
        System.out.print("Enter your option:");
        int option = in.nextInt();
        return option;
    }

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    // method for menu to select currency
    // ask user to enter the value (same or different method?)
    // read value, call the appropriate method for currency conversion
    // class for MMK to USD
    // class for USD to MMK
    // class for EUR to USD
    // class for USD to EUR
    // class or method to print the value returned and format its output
    // question: do we do that down here or up above in the menu or currency input method?
    // answer: do we do that down here or up above in the menu or currency input method?
}