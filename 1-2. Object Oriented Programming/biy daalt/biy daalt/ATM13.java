//Хэрэглэгч ATM-с мөнгө авах, шилжүүлэх ба үлдэгдлийг тооцоолох програм бич. Хэрэглэгчийн дансанд 654000
//төгрөг байгаа гэж үзнэ. Хэрэглэгчээс нууц үгийг авна. Уг тоог 4 оронтой тоо эсэхийг шалган, үнэн бол нууц
//үгийг зөв гэж үзэх ба дэлгэцэнд үлдэгдлээ шалгах, бэлэн мөнгө авах, эсвэл данс руу мөнгө шилжүүлэх
//сонголтууд гарч ирнэ. Бэлэн мөнгө авах бол мөнгөний хэмжээг оруулж өгөх ба үлдэгдэл хүрэлцэж байвал уг
//мөнгийг олгож, үлдэгдлийг тооцоолж хэвлэж өгнө. Хэрэв хүрэлцэхгүй бол “Уучлаарай, таны дансны үлдэгдэл
//хүрэлцэхгүй байна” гэсэн өгүүлбэрийг хэвлэ. Данс руу мөнгө шилжүүлэх бол эхлээд дансны дугаарыг гараас
//авна. Дансны дугаар 15 орон бүхий эерэг бүхэл тоон утга байвал дансны дугаарыг зөв байна гэж үзэх ба уг данс
//руу мөнгө шилжүүлснээр, өөрийн дансан дахь үлдэгдлийг тооцоолно. Эсрэг тохиолдолд дансны дугаар буруу
//байна гэж хэвлэнэ.

import java.util.Scanner;

public class ATM13 {
    public static void main(String[] args) {
        int balance = 654000;  // Initial account balance

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password (4-digit number): ");
        int password = input.nextInt();

        if (password < 1000 || password > 9999) {
            System.out.println("Invalid password.");
            return;
        }

        System.out.println("Welcome to the ATM!");
        System.out.println("Options:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Transfer Money");

        System.out.print("Select an option (1-3): ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("Balance: " + balance);
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                int amount = input.nextInt();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawn: " + amount);
                    System.out.println("Remaining balance: " + balance);
                } else {
                    System.out.println("Sorry, your account balance is not enough.");
                }
                break;
            case 3:
                System.out.print("Enter the account number (15-digit positive integer): ");
                long accountNumber = input.nextLong();
                if (accountNumber > 0 && String.valueOf(accountNumber).length() == 15) {
                    System.out.print("Enter the amount to transfer: ");
                    int transferAmount = input.nextInt();
                    if (transferAmount <= balance) {
                        balance -= transferAmount;
                        System.out.println("Transferred: " + transferAmount);
                        System.out.println("Remaining balance: " + balance);
                    } else {
                        System.out.println("Sorry, your account balance is not enough.");
                    }
                } else {
                    System.out.println("Incorrect account number.");
                }
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
        }
    }
}
