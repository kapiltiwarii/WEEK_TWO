package LEVEL2;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize the movie name
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null;
        this.price = 0.0;
    }

    // Method to book a ticket by assigning a seat and setting the price
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for " + movieName);
    }

    // Method to display the details of the ticket
    public void displayTicketDetails() {
        if (seatNumber != null && price != 0.0) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("No ticket has been booked yet.");
        }
    }

    // Main method for testing the MovieTicket class
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");
        ticket.displayTicketDetails();  
        ticket.bookTicket("A10", 12.50);
        ticket.displayTicketDetails();  
    }
}
