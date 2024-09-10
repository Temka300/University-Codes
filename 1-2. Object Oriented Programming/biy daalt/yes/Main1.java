import java.text.NumberFormat;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal ($1K - $1M): ", 1_000, 1_000_000);
        float annualIR = (float)readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte)readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualIR, years);

        String mortgageCurrency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageCurrency);
    }

    // Data-validation of input
    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    // Calculate mortgage
    public static double calculateMortgage(int principal,
                                           float annualIR,
                                           byte years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyIR = annualIR / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double mortgage = principal
                * (monthlyIR * Math.pow(1 + monthlyIR, numberOfPayments))
                / (Math.pow(1 + monthlyIR, numberOfPayments) - 1);

        return mortgage;
    }
}