import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AccountScreen extends JFrame {
    public AccountScreen(String loggedInID, DB db, Authenticator auth, Runnable onLogout) {

        // нэвтэрсэн хэрэглэгчийн бүртгэлийн объектыг олох
        Account account = db.getAccounts().stream().filter(a -> a.getAccountID().equals(loggedInID)).findFirst().get();

        setTitle("Account Operations");
        setSize(640, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ui элементүүдийг үүсгэх
        JLabel welcomeLabel = new JLabel("Welcome, " + account.getOwner().getFirstName() + " " + account.getOwner().getLastName());
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));

        // үлдэгдлийн шошгыг бий болгох
        JLabel balanceLabel = new JLabel("Current Balance: $" + account.getBalance());
        balanceLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        // create the label for account type
        JLabel accountTypeLabel = new JLabel("Account Type: " + account.getClass().getSimpleName());
        accountTypeLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        // create the label for question "What would you like to do today?"
        JLabel questionLabel = new JLabel("What would you like to do today?");
        questionLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        // create a panel to hold the labels
        JPanel labelsPanel = new JPanel();
        labelsPanel.setLayout(new BoxLayout(labelsPanel, BoxLayout.PAGE_AXIS));
        labelsPanel.add(welcomeLabel);
        labelsPanel.add(accountTypeLabel);
        labelsPanel.add(balanceLabel);
        labelsPanel.add(Box.createRigidArea(new Dimension(0, 20))); // add some vertical spacing
        labelsPanel.add(questionLabel);

        // set the size of the buttons
        Dimension buttonSize = new Dimension(600, 50);

        // create buttons for the four options
        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setPreferredSize(buttonSize);
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // open an input dialog to get the amount to withdraw
                String amount = JOptionPane.showInputDialog("Enter the amount to withdraw:");
                // check if the amount is valid
                if (InputValidator.isValidDoubleString(amount)) {
                    // check if the amount is greater than zero
                    if (Double.parseDouble(amount) > 0) {
                        // check if the amount is less than or equal to the balance
                        if (Double.parseDouble(amount) <= account.getBalance()) {
                            // withdraw the amount
                            account.setBalance(account.getBalance() - Double.parseDouble(amount));
                            // update the balance label
                            balanceLabel.setText("Current Balance: $" + account.getBalance());
                        } else {
                            JOptionPane.showMessageDialog(null, "Insufficient funds.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Amount must be greater than zero.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid amount.");
                }
            }
        });


        JButton depositButton = new JButton("Deposit");
        depositButton.setPreferredSize(buttonSize);
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // open an input dialog to get the amount to deposit
                String amount = JOptionPane.showInputDialog("Enter the amount to deposit:");
                // check if the amount is valid
                if (InputValidator.isValidDoubleString(amount)) {
                    // check if the amount is greater than zero
                    if (Double.parseDouble(amount) > 0) {
                        // deposit the amount
                        account.setBalance(account.getBalance() + Double.parseDouble(amount));
                        // update the balance label
                        balanceLabel.setText("Current Balance: $" + account.getBalance());
                    } else {
                        JOptionPane.showMessageDialog(null, "Amount must be greater than zero.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid amount.");
                }
            }
        });

        JButton changePasswordButton = new JButton("Change Password");
        changePasswordButton.setPreferredSize(buttonSize);
        changePasswordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // open an input dialog to get the new password
                String newPassword = JOptionPane.showInputDialog("Enter the new password:");
                // set the new password
                account.setPassword(newPassword);
            }
        });

        JButton logoutButton = new JButton("Logout");
        logoutButton.setPreferredSize(buttonSize);
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                onLogout.run();
            }
        });

        // create a panel to hold the buttons
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
        buttonsPanel.add(withdrawButton);
        buttonsPanel.add(depositButton);
        buttonsPanel.add(changePasswordButton);
        buttonsPanel.add(logoutButton);

        // create a panel to hold both the labels and buttons panels
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.add(labelsPanel, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        // add the main panel to the frame
        add(mainPanel);
    }
}
