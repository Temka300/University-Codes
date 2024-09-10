//Бүхэл тоон төрлийн (int) нэг хэмжээст массивт санамсаргүйгээр 100 хүртэлх утгуудыг олгож, хэвлэж хар. Уг
//массивын элементүүдийн хамгийн их утгыг byte төрлийн b хувьсагчид олгон хэвлэж харна уу.

import java.util.Random;

public class ArrayMaxValue18 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        // Assign random values to the array
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        // Find the maximum value
        byte b = findMaxValue(array);

        // Print the array
        System.out.println("Array:");
        printArray(array);

        // Print the maximum value
        System.out.println("Maximum value: " + b);
    }

    public static byte findMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;

        // Find the maximum value
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Convert the maximum value to byte
        byte b = (byte) max;

        return b;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
