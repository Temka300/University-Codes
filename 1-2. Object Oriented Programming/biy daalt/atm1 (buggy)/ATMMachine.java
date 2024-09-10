import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;

class ATMMachine extends ATMInterface {
    private Account account;
    private JLabel balanceLabel;

    public ATMMachine(Account account) {
        this.account = account;
    }

    protected boolean authenticate(String accountNumber, String pin) {
        return account.getAccountNumber().equals(accountNumber) && account.verifyPin(pin);
    }

    protected void loginSuccess() {
        getContentPane().removeAll();
        repaint();

        balanceLabel = new JLabel("Current Balance: $" + account.getBalance());
        balanceLabel.setBounds(300, 100, 200, 30);
        balanceLabel.setFont(new Font("Arial", Font.BOLD, 18));
        balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(balanceLabel);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(300, 150, 200, 40);
        withdrawButton.setFont(new Font("Arial", Font.BOLD, 16));
        withdrawButton.setBackground(new Color(0, 153, 204));
        withdrawButton.setForeground(Color.WHITE);
        withdrawButton.setFocusPainted(false);
        withdrawButton.setBorder(BorderFactory.createEmptyBorder());
        withdrawButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(withdrawButton);

        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(300, 200, 200, 40);
        depositButton.setFont(new Font("Arial", Font.BOLD, 16));
        depositButton.setBackground(new Color(0, 153, 204));
        depositButton.setForeground(Color.WHITE);
        depositButton.setFocusPainted(false);
        depositButton.setBorder(BorderFactory.createEmptyBorder());
        depositButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(depositButton);

        JButton transactionButton = new JButton("Transaction History");
        transactionButton.setBounds(300, 250, 200, 40);
        transactionButton.setFont(new Font("Arial", Font.BOLD, 16));
        transactionButton.setBackground(new Color(0, 153, 204));
        transactionButton.setForeground(Color.WHITE);
        transactionButton.setFocusPainted(false);
        transactionButton.setBorder(BorderFactory.createEmptyBorder());
        transactionButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(transactionButton);

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null, "Enter withdrawal amount:");
                if (input != null) {
                    try {
                        double amount = Double.parseDouble(input);
                        if (amount <= account.getBalance()) {
                            account.withdraw(amount);
                            balanceLabel.setText("Current Balance: $" + account.getBalance());
                            JOptionPane.showMessageDialog(null, "Withdrawal successful. New balance: $" + account.getBalance());
                        } else {
                            JOptionPane.showMessageDialog(null, "Insufficient funds.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
                    }
                }
            }
        });

        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null, "Enter deposit amount:");
                if (input != null) {
                    try {
                        double amount = Double.parseDouble(input);
                        account.deposit(amount);
                        balanceLabel.setText("Current Balance: $" + account.getBalance());
                        JOptionPane.showMessageDialog(null, "Deposit successful. New balance: $" + account.getBalance());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
                    }
                }
            }
        });

        transactionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder transactionHistory = new StringBuilder();
                for (String transaction : account.getTransactionHistory()) {
                    transactionHistory.append(transaction).append("\n");
                }

                JOptionPane.showMessageDialog(null, transactionHistory.toString(), "Transaction History", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        revalidate();
        repaint();
    }
}
