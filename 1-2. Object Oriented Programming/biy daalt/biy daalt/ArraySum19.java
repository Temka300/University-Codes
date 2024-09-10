//Бутархай тоон төрлийн нэг хэмжээст массивыг зарлах үед нь анхны утгуудыг нь олго. (Массивыг үүсгэхдээ new
//түлхүүр үг ашиглахгүй.) Уг массивын элементүүдийн нийлбэрийг int төрлийн s хувьсагчид авч, дэлгэцэнд хэвлэж
//харна уу.

public class ArraySum19 {
    public static void main(String[] args) {
        double[] array = new double[]{1.5, 2.7, 3.2, 4.8, 5.3};

        int sum = calculateSum(array);
        System.out.println("Sum: " + sum);
    }

    public static int calculateSum(double[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
