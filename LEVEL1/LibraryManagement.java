public class LibraryManagement  {
    // Book class
    public static class Book {
        // Public field
        public String ISBN;

        // Protected field
        protected String title;

        // Private field
        private String author;

        // Constructor
        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        // Public method to set the author name
        public void setAuthor(String author) {
            this.author = author;
        }

        // Public method to get the author name
        public String getAuthor() {
            return this.author;
        }
    }

    // EBook subclass
    public static class EBook extends Book {
        // Constructor for EBook
        public EBook(String ISBN, String title, String author) {
            super(ISBN, title, author);
        }

        // Method to display book details
        public void displayBookDetails() {
            // Accessing public field from superclass
            System.out.println("ISBN: " + ISBN);

            // Accessing protected field from superclass
            System.out.println("Title: " + title);

            // Accessing private field using getter method
            System.out.println("Author: " + getAuthor());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of EBook
        EBook ebook = new EBook("123-4567891234", "Learn Java", "John Doe");

        // Display book details using method in EBook class
        ebook.displayBookDetails();

        // Directly accessing public field
        System.out.println("Direct access to ISBN: " + ebook.ISBN);

        // Using methods to access private author field
        ebook.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
