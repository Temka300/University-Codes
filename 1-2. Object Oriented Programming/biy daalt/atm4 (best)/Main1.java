public class Main1 {
    public static void main(String[] args) {
        try {
            ATM.main(args);// some code that might throw an exception
        } catch (Exception e) {
            ErrorHandler.handle(e);
        }
    }
}
