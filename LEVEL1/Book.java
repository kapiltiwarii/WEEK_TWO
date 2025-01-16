public class Book {
    String title;
    String author;
    int price;
    // Constructor is declared
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
        Book details = new Book("The Monk who sold his Ferrari","Robin Sharma",200);
        details.displayBookDetails();
    }
    
}
