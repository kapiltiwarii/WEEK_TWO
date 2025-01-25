// Abstract class representing a general library item
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Concrete method to get item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    // Abstract method to be implemented by subclasses
    public abstract int getLoanDuration();
}

// Interface for reservable items
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Subclass representing a Book
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be borrowed for 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved by: " + borrowerName);
        } else {
            System.out.println("Book is currently not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Subclass representing a Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be borrowed for 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved by: " + borrowerName);
        } else {
            System.out.println("Magazine is currently not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Subclass representing a DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // DVDs can be borrowed for 5 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved by: " + borrowerName);
        } else {
            System.out.println("DVD is currently not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Main class to test the Library Management System
public class LibraryManagement {
    public static void main(String[] args) {
        // Creating library items
        LibraryItem book = new Book("B001", "Java Programming", "John Doe");
        LibraryItem magazine = new Magazine("M001", "Tech Today", "Jane Smith");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Displaying item details and loan duration using polymorphism
        System.out.println(book.getItemDetails() + ", Loan Duration: " + book.getLoanDuration() + " days");
        System.out.println(magazine.getItemDetails() + ", Loan Duration: " + magazine.getLoanDuration() + " days");
        System.out.println(dvd.getItemDetails() + ", Loan Duration: " + dvd.getLoanDuration() + " days");

        // Reserving items
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem("Alice");

        Reservable reservableMagazine = (Reservable) magazine;
        reservableMagazine.reserveItem("Bob");

        Reservable reservableDVD = (Reservable) dvd;
        reservableDVD.reserveItem("Charlie");

        // Checking availability
        System.out.println("Book available: " + reservableBook.checkAvailability());
        System.out.println("Magazine available: " + reservableMagazine.checkAvailability());
        System.out.println("DVD available: " + reservableDVD.checkAvailability());
    }
}
