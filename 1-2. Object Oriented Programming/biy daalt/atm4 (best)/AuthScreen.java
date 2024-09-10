import java.awt.*;
import javax.swing.*;
import java.util.function.BiConsumer;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class AuthScreen extends JFrame {

    public AuthScreen(BiConsumer<String, AuthScreen> authHandler, DB db, Authenticator auth) {

        // UI шинж чанаруудыг зааж өгнө
        setTitle("ATM");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        // UI элементүүдийг үүсгэх
        JLabel topHeading = new JLabel("ATM Machine");
        topHeading.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel userLabel = new JLabel("USERNAME (Dummy: " + db.getAccounts().get(0).getAccountID() + ")");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        JTextField userField = new JTextField(19);

        JLabel passLabel = new JLabel("PASSWORD (Dummy: " + db.getAccounts().get(0).getPassword() + ")");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        JPasswordField passField = new JPasswordField(19);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setPreferredSize(new Dimension(100, 50));

        // Нэвтрэх товчлуур дээр үйлдлийн сонсогч нэмнэ үү
        loginButton.addActionListener(e -> {
            // Текст талбаруудаас хэрэглэгчийн нэр, нууц үгээ аваарай
            String username = userField.getText();
            String password = new String(passField.getPassword());

            // хэрэглэгчийг баталгаажуулах
            int accountIndex = auth.authenticateUser(db.getAccounts(), username, password);

            if (accountIndex == -1) {
                // нэвтэрч чадсангүй
                JOptionPane.showMessageDialog(this, "Invalid username or password");
            } else {
                // нэвтэрч амжилттай боллоо
                authHandler.accept(username, this);
            }
        });

        // Эдгээр UI элементүүдийг байршилд нэмнэ
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.NORTH;
        add(topHeading, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(userLabel, gbc);

        gbc.gridy = 2;
        add(userField, gbc);

        gbc.gridy = 3;
        add(passLabel, gbc);

        gbc.gridy = 4;
        add(passField, gbc);

        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(loginButton, gbc);

        // хүрээ харагдах үед сонсогч нэмнэ
        addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent e) {
                // текст талбаруудыг арилгана
                userField.setText("");
                passField.setText("");

                // хаягуудыг хуурамч дансны мэдээллээр шинэчлэх
                userLabel.setText("USERNAME (Dummy: " + db.getAccounts().get(0).getAccountID() + ")");
                passLabel.setText("PASSWORD (Dummy: " + db.getAccounts().get(0).getPassword() + ")");
            }
        });
    }
}
