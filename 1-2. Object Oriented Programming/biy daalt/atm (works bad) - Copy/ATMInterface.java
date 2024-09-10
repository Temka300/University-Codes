import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

// Abstract class нь atmInterface илэрхийлж байна.
abstract class ATMInterface extends JFrame {
    protected JLabel welcomeLabel;
    protected JTextField accountNumberField;
    protected JPasswordField pinField;
    protected JButton loginButton;

    public ATMInterface() { 
        setTitle("ATM");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // UI buteej baina
        welcomeLabel = new JLabel("Welcome to the ATM!");
        accountNumberField = new JTextField();
        pinField = new JPasswordField();
        loginButton = new JButton("Login");

        // delgetsend garah ugsiig buteene.
        add(welcomeLabel);
        add(new JLabel("Account Number:"));
        add(accountNumberField);
        add(new JLabel("PIN:"));
        add(pinField);
        add(loginButton);

        // login tovchluur darhiig listener sonsoj baina
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // account bolon pin oruulsniig variabland hiih
                String accountNumber = accountNumberField.getText();
                String pin = new String(pinField.getPassword());
                // accountnii num bolond pin batalgaajuulhad authentica-iig duudna
                if (authenticate(accountNumber, pin)) {
                    // authenticate batalgaajullbal loginSuccess() duudna
                    loginSuccess();
                } else {
                    // authenticate butelguithed buruu baina gej error messej gargana
                    JOptionPane.showMessageDialog(null, "Invalid account number or PIN. Please try again.");
                }
            }
        });
    }

    // Burtgeliig batalgaajuulah Abstract method
    protected abstract boolean authenticate(String accountNumber, String pin);

    // login success duudah Abstract method
    protected abstract void loginSuccess();
}
