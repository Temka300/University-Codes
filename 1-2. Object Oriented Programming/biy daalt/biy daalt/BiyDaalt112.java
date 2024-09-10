class BiyDaalt112 {
    public static void main(String[] args) {
        Book112 book1 = new Book112("Java Programming", "John Smith", 20000, 2010);
        Book112 book2 = new Book112("Python Basics", "Jane Doe", 10000, 2015);

        System.out.println("Book 1 Information:");
        book1.printBookInfo();
        System.out.println();

        System.out.println("Book 2 Information:");
        book2.printBookInfo();
        System.out.println();

        if (book1.getYearPublished() > 2014) {
            book1.changePrice(book1.getPrice() + 10000);
        }

        if (book2.getYearPublished() > 2014) {
            book2.changePrice(book2.getPrice() + 10000);
        }

        System.out.println("Book 1 Information After Price Change:");
        book1.printBookInfo();
        System.out.println();

        System.out.println("Book 2 Information After Price Change:");
        book2.printBookInfo();
        System.out.println();
    }
}