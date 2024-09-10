 

public class BiyDaalt31 {
    public static void main(String[] args) {
        // Create 5 books or objects in the Book class.
        Book book1 = new Book("Book 1", "Author 1", 10.99, 2020);
        Book book2 = new Book("Book 2", "Author 2", 14.99, 2015);
        Book book3 = new Book("Book 3", "Author 3", 9.99, 2005);
        Book book4 = new Book("Book 4", "Author 4", 12.99, 1999);
        Book book5 = new Book(book1);

        // Find the total price of the books.
        double totalPrice = Book.getTotalPriceOfBooks();

        // Find the average price of the books.
        double averagePrice = Book.getAveragePriceOfBooks();

        // Compare the author names of any two books.
        Book.compareAuthorsAndChangePrice(book1, book2, 9.99);

        // Print information for all books.
        book1.display();
        book2.display();
        book3.display();
        book4.display();
        book5.display();

        // Print the total price and average price of the books.
        Book.displayTotalAndAveragePrice();
    }
}
