public class HotelBooking {
     String guestName;
     String roomType;
     int nights;
    // default constructor
     public HotelBooking(){
        this.guestName="Kapil";
        this.roomType="Ac";
        this.nights=1;
     }

     // Parameterised Constructor
     public HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights; 
     }

     public HotelBooking(HotelBooking result){
        this.guestName=result.guestName;
        this.roomType=result.roomType;
        this.nights=result.nights; 
     }

     void display(){
        System.out.println("Guest Name : "+guestName);
        System.out.println("Room Type : "+roomType);
        System.out.println("Nights : "+nights);
     }

     public static void main(String[] args) {
        HotelBooking result = new HotelBooking();
        System.out.println("Result using Default constructor :");
        result.display();

        HotelBooking paraResult = new HotelBooking("Mohan","non-Ac",2);
        System.out.println("Result using Parametrised constructor :");
        paraResult.display();

        HotelBooking copyResult = new HotelBooking(paraResult);
        System.out.println("Result using Copy constructor :");
        copyResult.display();
     }


}