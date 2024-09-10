public class InputValidator {
    public static boolean isValidDoubleString(String input) {
        if (input == null) {
            return false;
        }
        try {
            Double.parseDouble(input); // Attempt to parse the input string as a double
            return true; // If parsing succeeds, the input is a valid double string
        } catch (NumberFormatException e) {
            return false; // If parsing fails, the input is not a valid double string
        }
    }

    public static void main(String[] args) {
        System.out.println(isValidDoubleString("123.45")); // Test the isValidDoubleString method with a valid double string
        System.out.println(isValidDoubleString("123.45.67")); // Test the isValidDoubleString method with an invalid double string
    }
}
