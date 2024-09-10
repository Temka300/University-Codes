import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

// ATM interface-iig ATMachine class ashiglah baina.
class ATMMachine extends ATMInterface {
    private Account account;

    public ATMMachine(Account account) {
        this.account = account;
    }

    //account batalgaajuulhad oruulah num bolon pin     and PIN
    protected boolean authenticate(String accountNumber, String pin) {
        return account.getAccountNumber().equals(accountNumber) && account.verifyPin(pin);
    }

    // loginSuccess() bolsnii daraah arga
    protected void loginSuccess() {
        // login-ii ui alga bolgoh
        remove(accountNumberField);
        remove(pinField);
        remove(loginButton);

        // accountiin buh uildiig hiih ui buteej baina
        JLabel balanceLabel = new JLabel("Current Balance: $" + account.getBalance());
        JButton withdrawButton = new JButton("Withdraw");
        JButton depositButton = new JButton("Deposit");
        JButton transactionButton = new JButton("Transaction History");
        
        // BalanceLabel position, size, style-iig hiij baina
        balanceLabel.setBounds(300, 100, 200, 30);
        balanceLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        // withdraw tovchluuriig buteeh kod
        withdrawButton.setBounds(300, 150, 200, 30);
        withdrawButton.setFont(new Font("Arial", Font.BOLD, 14));
        withdrawButton.setBackground(new Color(0, 153, 204));
        withdrawButton.setForeground(Color.WHITE);
        withdrawButton.setFocusPainted(false);
        withdrawButton.setBorder(BorderFactory.createEmptyBorder());
        withdrawButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // deposit tovchluur buteeh kod
        depositButton.setBounds(300, 200, 200, 30);
        depositButton.setFont(new Font("Arial", Font.BOLD, 14));
        depositButton.setBackground(new Color(0, 153, 204));
        depositButton.setForeground(Color.WHITE);
        depositButton.setFocusPainted(false);
        depositButton.setBorder(BorderFactory.createEmptyBorder());
        depositButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // transaction history tovchluur buteeh kod
        transactionButton.setBounds(300, 250, 200, 30);
        transactionButton.setFont(new Font("Arial", Font.BOLD, 14));
        transactionButton.setBackground(new Color(0, 153, 204));
        transactionButton.setForeground(Color.WHITE);
        transactionButton.setFocusPainted(false);
        transactionButton.setBorder(BorderFactory.createEmptyBorder());
        transactionButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // UI daa oruulj baina
        add(balanceLabel);
        add(withdrawButton);
        add(depositButton);
        add(transactionButton);

        // withdraw tovchluur darhiig actionListener sonsoj baina
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = JOptionPane.showInputDialog(null, "Enter password to withdraw:");
                
                // withdraw hiihed garch ireh batalgaajuulah kod
                if (password.equals("1234")) {
                    String input = JOptionPane.showInputDialog(null, "Enter withdrawal amount:");
                    double amount = Double.parseDouble(input);

                    if (amount <= account.getBalance()) {
                        // Perform withdrawal and update the balance label
                        account.withdraw(amount);
                        balanceLabel.setText("Current Balance: $" + account.getBalance());
                        JOptionPane.showMessageDialog(null, "Withdrawal successful. New balance: $" + account.getBalance());

                        // Receipt-iig txt file ruu oruulj baina
                        String receipt = "Withdrawal Receipt\n" +
                                "Amount: $" + amount + "\n" +
                                "Date: " + new Date() + "\n" +
                                "Current Balance: $" + account.getBalance() + "\n";

                        try {
                            String filename = "withdrawal_receipt.txt";
                            FileWriter writer = new FileWriter(filename);
                            writer.write(receipt);
                            writer.close();
                            JOptionPane.showMessageDialog(null, "Receipt printed to: " + filename);
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "Failed to print receipt.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient funds.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect password. Withdrawal canceled.");
                }
            }
        });

        // deposit tovchluuriig darhiig sonsoj bui actionListener
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null, "Enter deposit amount:");
                double amount = Double.parseDouble(input);

                // deposit hiisnii daraa balanceLabel update hiine
                account.deposit(amount);
                balanceLabel.setText("Current Balance: $" + account.getBalance());
                JOptionPane.showMessageDialog(null, "Deposit successful. New balance: $" + account.getBalance());
            }
        });

        //transaction history tovchluuriig sonsoj bui actionListener
        transactionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder transactionHistory = new StringBuilder();
                for (String transaction : account.getTransactionHistory()) {
                    transactionHistory.append(transaction).append("\n");
                }

                // transaction history iluu windowond haruulah
                JOptionPane.showMessageDialog(null, transactionHistory.toString());
            }
        });

        // UI ajillaj baih zuur shinechlel garhad update hiih zuils
        revalidate();
        repaint();
    }
}