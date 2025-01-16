public class MobilePhone {
    String brand;
    String model;
    int price;
  // Constructor is declared
   MobilePhone(String brand , String model, int price){
    this.brand=brand;
    this.model=model;
    this.price=price;
   }

   //Method to display results
   void display(){
    System.out.println("Mobile Phone Brand :"+brand);
    System.out.println("Mobile Phone model :"+model);
    System.out.println("Mobile Phone price :"+price);
   }
    
   public static void main(String[] args) {
    MobilePhone resMobilePhone=new MobilePhone("Motorola", "G84 5G", 20000);
    resMobilePhone.display();
   }
}
