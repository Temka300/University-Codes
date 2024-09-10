public class Account {
    String accountID; // Declaration of the account ID variable
    String password; // Declaration of the password variable
    double balance; // Declaration of the balance variable
    User owner; // Declaration of the owner variable

    // Constructor for creating an Account object
    public Account(double balance, User owner) {
        this.accountID = IDManager.generateID(); // Generate a unique account ID using the IDManager class
        this.password = IDManager.generatePassword(); // Generate a random password using the IDManager class
        this.balance = balance; // Set the initial balance for the account
        this.owner = owner; // Set the owner of the account
    }

    // Getter method for retrieving the account ID
    public String getAccountID() {
        return accountID;
    }

    // Setter method for updating the account ID
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    // Getter method for retrieving the account balance
    public double getBalance() {
        return balance;
    }

    // Setter method for updating the account balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter method for retrieving the account owner
    public User getOwner() {
        return owner;
    }

    // Setter method for updating the account owner
    public void setOwner(User owner) {
        this.owner = owner;
    }

    // Getter method for retrieving the account password
    public String getPassword() {
        return password;
    }

    // Setter method for updating the account password
    public void setPassword(String password) {
        this.password = password;
    }

    // Override the toString() method to provide a string representation of the Account object
    public String toString() {
        return "Account ID: " + accountID + " Balance: " + balance + " Owner: " + owner;
    }

    // Main method for testing the Account class
    public static void main(String[] args) {

        User user = new User("Temka", "Serge"); // Create a User object with name and surname
        Account account = new Account(1000, user); // Create an Account object with initial balance and owner
        System.out.println(account); // Print the string representation of the account using the toString() method

    }

}
