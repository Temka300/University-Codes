//араах бүхэл тоон төрлийн (int) 2 хэмжээст массивыг үүсгэж, санамсаргүйгээр 0-20 хүртэлх утгыг олгож, хэвлэж
//харна уу. Массивын тэгш болоод 10-с их утгуудын нийлбэр болон сондгой болоод 10-с бага утгуудын
//нийлбэрийг тус тус олж хэвлэж харна уу.
//a00 a01 a02
//a10 a11
//a20 a21 a22 a23 a24
//a30 a31 a32

import java.util.Random;

public class ArrayOperations110 {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[5];
        array[3] = new int[3];

        Random random = new Random();

        // Assign random values to the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(21);
            }
        }

        // Print the array
        System.out.println("Array:");
        printArray(array);

        // Calculate the sum of even values greater than 10 and odd values less than 10
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int value = array[i][j];
                if (value % 2 == 0 && value > 10) {
                    evenSum += value;
                } else if (value % 2 == 1 && value < 10) {
                    oddSum += value;
                }
            }
        }

        // Print the sums
        System.out.println("Sum of even values greater than 10: " + evenSum);
        System.out.println("Sum of odd values less than 10: " + oddSum);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
