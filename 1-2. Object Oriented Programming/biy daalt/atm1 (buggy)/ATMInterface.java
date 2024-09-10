import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;

abstract class ATMInterface extends JFrame {
    protected JTextField accountNumberField;
    protected JPasswordField pinField;
    protected JButton loginButton;

    public ATMInterface() {
        setTitle("ATM");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome to the ATM!");
        welcomeLabel.setBounds(300, 50, 200, 30);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(welcomeLabel);

        JLabel accountNumberLabel = new JLabel("Account Number:");
        accountNumberLabel.setBounds(200, 150, 200, 30);
        add(accountNumberLabel);

        accountNumberField = new JTextField();
        accountNumberField.setBounds(400, 150, 200, 30);
        add(accountNumberField);

        JLabel pinLabel = new JLabel("PIN:");
        pinLabel.setBounds(200, 200, 200, 30);
        add(pinLabel);

        pinField = new JPasswordField();
        pinField.setBounds(400, 200, 200, 30);
        add(pinField);

        loginButton = new JButton("Login");
        loginButton.setBounds(350, 250, 100, 40);
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        loginButton.setBackground(new Color(0, 153, 204));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setBorder(BorderFactory.createEmptyBorder());
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String accountNumber = accountNumberField.getText();
                String pin = new String(pinField.getPassword());
                if (authenticate(accountNumber, pin)) {
                    loginSuccess();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid account number or PIN. Please try again.");
                }
            }
        });
    }

    protected abstract boolean authenticate(String accountNumber, String pin);

    protected abstract void loginSuccess();
}