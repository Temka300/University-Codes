 

public class Book {
    // Member Data (Instance Variables):
    private String name;
    private String author;
    private double price;
    private int yearPublished;
    private static double totalPriceOfBooks;
    private static int numberOfBooks;

    // Constructor (Accepts passed values and assigns to variables)
    public Book(String name, String author, double price, int yearPublished) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.yearPublished = yearPublished;
        totalPriceOfBooks += price;
        numberOfBooks++;
    }

    // Constructor (Copy constructor - receives the passed object and the value of the object
    // assign to new object variable)
    public Book(Book other) {
        this.name = other.name;
        this.author = other.author;
        this.price = other.price;
        this.yearPublished = other.yearPublished;
        totalPriceOfBooks += price;
        numberOfBooks++;
    }

    // Function to print all book information (function name display)
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Year Published: " + yearPublished);
        System.out.println();
    }

    // Function to print total price and average price of books (function name display)
    public static void displayTotalAndAveragePrice() {
        double averagePriceOfBooks = totalPriceOfBooks / numberOfBooks;
        System.out.println("Total Price of Books: " + totalPriceOfBooks);
        System.out.println("Average Price of Books: " + averagePriceOfBooks);
    }

    // Change price function (helper function with private access)
    private void changePrice(double newPrice) {
        totalPriceOfBooks -= price;
        totalPriceOfBooks += newPrice;
        price = newPrice;
    }

    // Static function to find total price of books
    public static double getTotalPriceOfBooks() {
        return totalPriceOfBooks;
    }

    // Static function to find average price of books
    public static double getAveragePriceOfBooks() {
        return totalPriceOfBooks / numberOfBooks;
    }

    // Compare the names of the authors of two books and change the price of the two books if they are the same
    public static void compareAuthorsAndChangePrice(Book book1, Book book2, double newPrice) {
        if (book1.author.equals(book2.author)) {
            book1.changePrice(newPrice);
            book2.changePrice(newPrice);
        }
    }
}
