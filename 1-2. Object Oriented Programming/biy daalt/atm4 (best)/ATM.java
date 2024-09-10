public class ATM {
    DB db;
    Authenticator auth;
    AuthScreen authScreen;
    AccountScreen accountScreen;

    public ATM() {
        db = new DB();                      // Өгөгдлийн санг эхлүүлэх
        auth = new Authenticator();         // Баталгаажуулагчийг эхлүүлнэ үү

        // Бүх акаунт болон нууц үгээ бүртгэнэ үү
        System.out.println("Testiin Accounts:");
        db.getAccounts().forEach(account -> {
            System.out.println("Username: " + account.getAccountID() + " Password: " + account.getPassword());
        });

        // Дэлгэцүүдийг эхлүүлэх

        // Энэ дэлгэц нь баталгаажуулалтыг зохицуулдаг
        AuthScreen authScreen = new AuthScreen((accountID, authScreenObject) -> {
            // Энэ дэлгэц нь дансны үйл ажиллагааг зохицуулдаг
            accountScreen = new AccountScreen(accountID, db, auth, () -> {
                // Хэрэглэгч гарах үед зохицуулна.
                authScreenObject.setVisible(true);
            });
            authScreenObject.setVisible(false);
            accountScreen.setVisible(true);
        }, db, auth);

        // Баталгаажуулах дэлгэцийг харуул
        authScreen.setVisible(true);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
    }
}
