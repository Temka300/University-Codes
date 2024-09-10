//Өгөгдсөн тоо хүртэлх тоонуудын үржвэрийг ол. Жнь: n=5 бол 1*2*3*4*5 үржвэрийг олно. Рекурсив ашиглана.
//Статик функц тодорхойлно уу.

public class Urjver16 {
    public static void main(String[] args) {
        int n = 5;
        long product = calculateProduct(n);
        System.out.println("Product: " + product);
    }

    public static long calculateProduct(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateProduct(n - 1);
        }
    }
}
