//Гараас A, B, C, D, F эдгээр үсгэн үнэлгээг өгөхөд харгалзах тоон үнэлгээг хэвлэж гарга. Жишээ нь: ‘A’ гэж
//оруулсан тохиолдолд 91-100, B гэж оруулсан тохиолдолд 81-91 гэх мэт. Харин эдгээрээс өөр үсэг оруулсан
//тохиолдолд “Та дээрх 5 үсэгнээс сонгон оруулна уу” гэсэн мэдээллийг гаргадаг байх программ зохио. Уг
//бодлогонд switch сонголтын командыг ашигла.

import java.util.Scanner;

public class BiyDaalt11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = input.next().charAt(0);

        int lowerBound, upperBound;
        switch (grade) {
            case 'A':
                lowerBound = 91;
                upperBound = 100;
                break;
            case 'B':
                lowerBound = 81;
                upperBound = 90;
                break;
            case 'C':
                lowerBound = 71;
                upperBound = 80;
                break;
            case 'D':
                lowerBound = 61;
                upperBound = 70;
                break;
            case 'F':
                lowerBound = 0;
                upperBound = 60;
                break;
            default:
                System.out.println("Please select from the above 5 letters.");
                return;
        }

        System.out.printf("Dun: %d-%d%n", lowerBound, upperBound);
    }
}
