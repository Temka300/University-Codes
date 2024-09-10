import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("2531", "1234", 1000.0); // Example account
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ATMMachine atm = new ATMMachine(account);
                atm.setVisible(true);
            }
        });
    }
}