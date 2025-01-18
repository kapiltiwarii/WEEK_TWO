public class Book {
    String title;
    String author;
    int price;
    Book(){
      this.title="Unknown title";
      this.author="Unknown author";
      this.price=0;
    }
    //Prameterised Constructor is declared
    Book( String title,String author,int price){
       this.title=title;
       this.author=author;
       this.price=price;
    }
    // Method to display details of book
    void displayBookDetails(){
        System.out.println("Title of Book : "+title);
        System.out.println("Author of Book : "+author);
        System.out.println("Price of Book : "+price);
    }

    public static void main(String[] args) {
        Book constrBook= new Book();
        Book details = new Book("The Monk who sold his Ferrari","Robin Sharma",200);
        System.out.println("Book details using default constructor");
        constrBook.displayBookDetails();

        System.out.println("Book details using Parametreised constructor");
        details.displayBookDetails();
    }
    
}
