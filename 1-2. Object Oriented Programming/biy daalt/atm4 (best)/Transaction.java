public class Transaction {
    String tID;         // Transaction ID
    String tType;       // Transaction type
    double tAmount;     // Transaction amount
    String accountID;   // Associated account ID

    // Constructor to create a new transaction with the provided details
    public Transaction(String accountID, String tType, double tAmount) {
        this.tID = IDManager.generateID();   // Generate a unique transaction ID using the IDManager class
        this.accountID = accountID;
        this.tType = tType;
        this.tAmount = tAmount;
    }

    // Getter and setter methods for the transaction properties

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String gettID() {
        return tID;
    }

    public void settID(String tID) {
        this.tID = tID;
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType;
    }

    public double gettAmount() {
        return tAmount;
    }

    public void settAmount(double tAmount) {
        this.tAmount = tAmount;
    }

    // Returns a string representation of the transaction
    public String toString() {
        return "Transaction ID: " + tID + " Transaction Type: " + tType + " Transaction Amount: " + tAmount;
    }

    public static void main(String[] args) {
        // Example usage: Create a transaction and print its details
        Transaction transaction = new Transaction("123", "Deposit", 1000);
        System.out.println(transaction);
    }
}
