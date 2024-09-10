public class BusinessAccount extends Account {
    String businessName;

    public BusinessAccount(double balance, User owner, String businessName) {
        super(balance, owner); // Call the constructor of the superclass (Account) to initialize balance and owner
        this.businessName = businessName; // Set the businessName specific to BusinessAccount
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String toString() {
        return "Account ID: " + accountID + " Balance: " + balance + " Owner: " + owner + " Business Name: " + businessName;
    }

    public static void main(String[] args) {
        User user = new User("Temka", "Serge");
        BusinessAccount account = new BusinessAccount(1000, user, "John's Business"); // Create a new instance of BusinessAccount
        System.out.println(account); // Print the account details using the overridden toString() method
    }
}
