public class Book2 {
     String title;
     String author;
     double price;
     boolean isAvailable;

    // Default constructor
    public Book2() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public Book2(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("You have successfully borrowed the book: " + title);
            isAvailable = false;
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently not available.");
        }
    }
    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Creating a book using the parameterized constructor
        Book2 book1 = new Book2("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);

        // Displaying book details
        book1.displayDetails();

        // Attempting to borrow the book
        book1.borrowBook();

        // Trying to borrow the same book again
        book1.borrowBook();


        // Displaying book details after updating the price
        book1.displayDetails();
    }
}
