import java.util.Scanner;

//Гараас авсан тоо нь 0-с бага бол давталтыг зогсоо, 20-с их бол уг тоог хэвлэлгүй алгасах, эсрэг тохиолдолд уг
//тоог хэвлэнэ. /do while, break, continue ашигла. 

public class NumberPrinter14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Too oruul: ");
        //int number = input.nextInt();
        int number = -1;

        do {
            number++;

            if (number < 0) {
                break;
            }

            if (number > 20) {
                continue;
            }

            System.out.println(number);
        } while (number < 20);
    }
}
