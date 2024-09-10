public class SavingsAccount extends Account {
    double interestRate; // Declaration of the interest rate variable

    // Constructor for creating a SavingsAccount object
    public SavingsAccount(double balance, User owner, double interestRate) {
        super(balance, owner); // Call the constructor of the superclass Account
        this.interestRate = interestRate; // Set the interest rate for the SavingsAccount
    }

    // Getter method for retrieving the interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Setter method for updating the interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Override the toString() method to provide a string representation of the SavingsAccount object
    public String toString() {
        return "Account ID: " + accountID + " Balance: " + balance + " Owner: " + owner + " Interest Rate: " + interestRate;
    }

    // Main method for testing the SavingsAccount class
    public static void main(String[] args) {
        User user = new User("Temka", "Serge"); // Create a User object with name and surname
        SavingsAccount account = new SavingsAccount(1000, user, 0.5); // Create a SavingsAccount object with initial balance, owner, and interest rate
        System.out.println(account); // Print the string representation of the account using the toString() method
    }
}
