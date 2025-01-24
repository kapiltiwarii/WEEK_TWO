//Super class Book
class Book {
    protected String title;
    protected int publicationYear;

    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    // Method to display details of book
    public void displayInfo() {
        System.out.println("Title of Book :" + title);
        System.out.println("publication year is :" + publicationYear);
    }
}

//Base class Author
class Author extends Book {
    private String name;
    private String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
     // Method to display Author details and book details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author name: " + name);
        System.out.println("Bio of Author: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        // Creating Object
        Book details = new Author("Gitanjali", 1910, "Rabindranath Tagore ", "Rabindranath Tagore was a renowned Bengali poet, novelist, painter, and playwright, celebrated as a monumental figure in both Indian and global literature");
        // Calling subclass method
        details.displayInfo();
    }
}