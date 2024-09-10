/*
Book классыг зохион байгуулна уу. Мөн Book классыг шалгах BookDemo классыг тодорхойлно. Гишүүн
өгөгдлүүд бүгд private хандалттай байна.
class Book
{ Гишүүн өгөгдлүүд (Инстэнс хувьсагчид):
Номын нэр
Номын зохиогч
Номын үнэ
Ном хэвлэгдсэн он
Гишүүн функцүүд:
БайгуулагчНомын бүх мэдээллийг хэвлэх функц
Үнийг өөрчлөх функц
Оныг буцаадаг функц
}
class BookDemo
{ public static void main(String []args)
{ //Book класс дээр 2 ном буюу обьект үүсгэнэ үү.
//Ном тус бүрийн мэдээллийг хэвлэж харна уу.
//Ном тус бүр 2014 оноос хойш хэвлэгдсэн эсэхийг шалгаж, нөхцөл үнэн бол үнийг нь 10000-р
нэмэгдүүл.
//Үнэ өөрчлөгдсөний дараа дахин ном тус бүрийн мэдээллийг хэвлэж харна уу
}
} 
 */

class Book112 {
    private String name;
    private String author;
    private double price;
    private int yearPublished;

    public Book112(String name, String author, double price, int yearPublished) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.yearPublished = yearPublished;
    }

    public void printBookInfo() {
        System.out.println("Book: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Year Published: " + yearPublished);
    }

    public void changePrice(double newPrice) {
        price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
