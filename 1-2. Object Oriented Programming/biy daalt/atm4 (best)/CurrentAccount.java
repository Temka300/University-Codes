public class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(double balance, User owner, double overdraftLimit) {
        super(balance, owner); // Call the constructor of the superclass (Account) to initialize balance and owner
        this.overdraftLimit = overdraftLimit; // Set the overdraftLimit specific to CurrentAccount
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public String toString() {
        return "Account ID: " + accountID + " Balance: " + balance + " Owner: " + owner + " Overdraft Limit: " + overdraftLimit;
    }

    public static void main(String[] args) {
        User user = new User("Temka", "Serge");
        CurrentAccount account = new CurrentAccount(1000, user, 1000); // Create a new instance of CurrentAccount
        System.out.println(account); // Print the account details using the overridden toString() method
    }
}
