//Англи хэлний сургалтын бүртгэл явагдаж байгаа ба сургалтын төлбөр бүх түвшинд ижил 250000 байсан. Энэ
//сарын элсэлтэндээ түвшин бүрт ялгаатай үнэ тогтоохоор шийдсэн /3 түвшинтэй/ бөгөөд өмнө нь энэ сургалтанд
//сууж байсан, дараагийн шатанд суралцахаар ирсэн бол хөнгөлөлт үзүүлэхээр болсон.
//• Гараас сургалтанд суух хүний ямар түвшинд суух болон өмнө нь сууж байсан эсэхийг авна. /Суралцаж
//байсан бол 1, үгүй бол 0 гэсэн утга оруул/
//• Хэрэв тухайн хүн 1-р түвшний ангид суралцах бол 250000
//• 2-р түвшин, өмнө нь суралцаж байгаагүй бол 300000, суралцаж байсан бол 10% хөнгөлнө.
//• 3-р түвшин, өмнө нь суралцаж байгаагүй бол 350000, суралцаж байсан бол 15% хөнгөлнө.
//• Тухайн хүний хэдэн төгрөг төлөхийг дэлгэцэнд хэвлэ.
//• Уг бодлогыг switch-case болон if-else ашиглан хийнэ үү.

import java.util.Scanner;

public class CourseRegistration12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the level (1, 2, 3): ");
        int level = input.nextInt();

        System.out.print("Have you attended the course before? (1 for Yes, 0 for No): ");
        int attendedBefore = input.nextInt();

        int tuitionFee;

        switch (level) {
            case 1:
                tuitionFee = 250000;
                break;
            case 2:
                if (attendedBefore == 1) {
                    tuitionFee = (int) (300000 * 0.9);
                } else {
                    tuitionFee = 300000;
                }
                break;
            case 3:
                if (attendedBefore == 1) {
                    tuitionFee = (int) (350000 * 0.85);
                } else {
                    tuitionFee = 350000;
                }
                break;
            default:
                System.out.println("Invalid level selected.");
                return;
        }

        System.out.println("Tuition fee: " + tuitionFee);
    }
}
