import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

// Account class нь банкны дансыг илэрхийлнэ
class Account {
    private String accountNumber;
    private String pin;
    private double balance;
    private ArrayList<String> transactionHistory;

    // Дансны дугаар, ПИН, үлдэгдэлтэй дансыг эхлүүлэхийн тулд бүтээгч
    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    // Дансны дугаарыг авах getaccountnumber method
    public String getAccountNumber() {
        return accountNumber;
    }

    // Оруулсан ПИН нь тухайн бүртгэлийн PIN кодтой таарч байгаа эсэхийг шалгах арга
    public boolean verifyPin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    // Одоогийн үлдэгдлийг авах Getter арга
    public double getBalance() {
        return balance;
    }

    // данснаас мөнгө гаргах арга
    public void withdraw(double amount) {
        balance -= amount;
        transactionHistory.add("Withdrawal: $" + amount + " on " + new Date());
    }

    // Дансанд мөнгө байршуулах арга
    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposit: $" + amount + " on " + new Date());
    }

    // Гүйлгээний түүхийг авах Getter арга
    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }
    
    
}
