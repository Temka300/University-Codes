//Өгөгдсөн тооны цифрүүдийн нийлбэрийг ол. Рекурсив ашиглана. Статик функц тодорхойлно уу.

public class DigitSumCalculator17 {
    public static void main(String[] args) {
        int number = 12345;
        int sum = calculateDigitSum(number);
        System.out.println("Sum of digits: " + sum);
    }

    public static int calculateDigitSum(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number % 10 + calculateDigitSum(number / 10);
        }
    }
}
