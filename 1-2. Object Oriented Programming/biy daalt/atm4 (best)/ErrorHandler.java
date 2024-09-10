import javax.swing.JOptionPane;

public class ErrorHandler {
    public static void handle(Exception e) {
        System.out.println("An error occurred: " + e.getMessage()); // Print the error message to the console
        e.printStackTrace(); // Print the stack trace for debugging purposes
        // Here, you could add additional error handling logic, such as logging the error to a file or sending an email notification to the developer
    }
}

