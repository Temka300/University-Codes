import java.util.ArrayList;

public class Authenticator {
    // Authenticates the user by checking the provided account ID and password against the stored account information.
    // Returns the index of the matched account in the accounts list if authentication is successful.
    // Returns -1 if authentication fails.
    public int authenticateUser(ArrayList<Account> accounts, String accountID, String accountPassword) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountID().equals(accountID) && accounts.get(i).getPassword().equals(accountPassword)) {
                return i;
            }
        }
        return -1;
    }
}
