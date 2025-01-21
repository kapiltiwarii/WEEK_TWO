package LEVEL1;

public class Book {
    static String libraryName="BS LIBRARY";

    String title;
    String author;
    final int isbn;

   // Constructor to initialise the details of book
    Book(String title , String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    //Method to display library name and book details
    public  void displayLibarryName(){
        if (this instanceof Book){
        System.out.println("Library name is :"+libraryName);
        System.out.println("Title is :"+title);
        System.out.println("Author is :"+author);
        System.out.println("Book no. is :"+isbn);
        }
        else {
            System.out.println("This is not an instance of Book class");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Ramcharit Manas","Tulsidas ji",01);//First Book object// is created
        Book book2 = new Book("Geeta","Veda Vyasa",02);//Second book object is created

        //Displaying the book details by calling the function using objects
        book1.displayLibarryName();
        book2.displayLibarryName();

        //Changing the library name
        Book.libraryName="Kanha Library";

        //Again displaying the details
        book1.displayLibarryName();
        book2.displayLibarryName();

    }
}
