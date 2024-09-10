/**Бүхэл тоон төрлийн хоёр хэмжээст массив (4x4 хэмжээтэй) үүсгэ. Дараах статик функцүүдийг тодорхойл.
• Бүхэл тоон төрлийн хоёр хэмжээст массивыг хүлээн авч гол диогналь дээрх элементүүдийн нийлбэрийг
олж, уг нийлбэрийн утгыг буцаадаг функц
• Бүхэл тоон төрлийн хоёр хэмжээст массивыг хүлээн авч хөндлөн диогналь дээрх элементүүдийн утгыг
нэгээр хорогдуулж, өөрчлөлтийг үндсэн функц дотор хэвлэ.
• Бүхэл тоон төрлийн хоёр хэмжээст массив хүлээн авч гол диогналь дээрх элементүүдийг бүхэл тоон
төрлийн нэг хэмжээт массивт авч буцаадаг функц
*/
public class ArrayOperations111 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int diagonalSum = findDiagonalSum(array);
        System.out.println("Sum of main diagonal: " + diagonalSum);

        decrementCrossDiagonal(array);
        System.out.println("Array after decrementing cross-diagonal:");
        printArray(array);

        int[] diagonalElements = getDiagonalElements(array);
        System.out.println("Elements of main diagonal:");
        printArray(diagonalElements);
    }

    public static int findDiagonalSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    public static void decrementCrossDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][array.length - 1 - i]--;
        }
    }

    public static int[] getDiagonalElements(int[][] array) {
        int[] diagonalElements = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            diagonalElements[i] = array[i][i];
        }
        return diagonalElements;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
