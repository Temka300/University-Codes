import java.util.ArrayList;

public class DB {
    
    ArrayList<User> users;              // Хэрэглэгчийн объектуудыг хадгалах цуглуулга
    ArrayList<Account> accounts;        // Бүртгэлийн объектуудыг хадгалах цуглуулга
    ArrayList<Transaction> transactions;    // Гүйлгээний объектуудыг хадгалах цуглуулга

    public DB() {
        // зарим хуурамч өгөгдөл үүсгэх

        // Цуглуулгыг эхлүүлэх
        users = new ArrayList<User>();
        accounts = new ArrayList<Account>();
        transactions = new ArrayList<Transaction>();

        // зарим хуурамч хэрэглэгчдийг нэмж байна
        users.add(new User("Temka", "Serge"));
        users.add(new User("Genghis", "Khan"));
        users.add(new User("Temuujin", "Sergelentsogt"));

        // өөр өөр хэрэглэгчдэд зориулсан өөр өөр төрлийн хуурамч данс нэмэх

        // хэрэглэгч 1, бизнесийн болон харилцах данс
        accounts.add(new BusinessAccount(1000, users.get(0), "Temka's Business"));
        accounts.add(new CurrentAccount(2000, users.get(0), 1000));

        // хэрэглэгч 2, хадгаламжийн болон харилцах данс
        accounts.add(new SavingsAccount(3000, users.get(1), 0.5));
        accounts.add(new CurrentAccount(4000, users.get(1), 2000));

        // хэрэглэгч 3, бизнесийн болон хадгаламжийн данс
        accounts.add(new BusinessAccount(5000, users.get(2), "Temuujin's Business"));
        accounts.add(new SavingsAccount(6000, users.get(2), 0.5));

        // зарим хуурамч гүйлгээг нэмж байна

        // хэрэглэгч 1, бизнесийн данснаас гарах
        accounts.get(0).setBalance(accounts.get(0).getBalance() - 100);
        transactions.add(new Transaction(accounts.get(0).getAccountID(), "Withdraw", 100));

        // хэрэглэгч 1, харилцах дансанд байршуулах
        accounts.get(1).setBalance(accounts.get(1).getBalance() + 100);
        transactions.add(new Transaction(accounts.get(1).getAccountID(), "Deposit", 100));

        // хэрэглэгч 2, хадгаламжийн данснаас гарах
        accounts.get(2).setBalance(accounts.get(2).getBalance() - 100);
        transactions.add(new Transaction(accounts.get(2).getAccountID(), "Withdraw", 100));
    }

    // Цуглуулгад хандах аргуудыг олж авах

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public static void main(String[] args) {
        // Хэрэглээний жишээ: Өгөгдлийн сан үүсгэж, хэрэглэгчид, данс, гүйлгээг хэвлэх
        DB db = new DB();
        System.out.println(db.getUsers());
        System.out.println(db.getAccounts());
        System.out.println(db.getTransactions());
    }
}
