//Гараас нийт 10 тэмдэгт авах ба хэрэв а үсэг дарсан бол давталтыг зогсоо. Давталтаас гарсны дараа давталт нийт
//хэдэн удаа хийгдсэнийг хэвлэ. /break ашигла./

import java.util.Scanner;

public class CharacterCounter15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter characters (press 'b' to stop):");

        while (true) {
            char ch = input.next().charAt(0);

            if (ch == 'b') {
                break;
            }

            count++;
        }

        System.out.println("Loop executed " + count + " times.");
    }
}
